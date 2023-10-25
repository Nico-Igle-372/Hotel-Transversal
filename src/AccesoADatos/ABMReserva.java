package AccesoADatos;

import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ABMReserva {

    private Connection conn;
    private ABMHabitacion ABMH = new ABMHabitacion();
    private ABMHuesped ABMHues = new ABMHuesped();

    public ABMReserva() {
        conn = Conexion.getConexion();
    }

    public List<Habitacion> buscarHabitacionParaReserva(int cantPer, LocalDate checkIn, LocalDate checkOut) {
        List<Habitacion> disponibles = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE idHabitacion IN "
                + "(SELECT habitacion.idHabitacion from habitacion join tipodehabitacion ON "
                + "(habitacion.idTipoHabitacion = tipodehabitacion.idTipoHabitacion) "
                + "WHERE capacidad >= ?) AND (habitacion.estado = 0 OR idHabitacion NOT IN "
                + "(SELECT habitacion.idHabitacion FROM habitacion JOIN reserva ON "
                + "(reserva.idHabitacion = habitacion.idHabitacion)  "
                + "WHERE ? BETWEEN fechaEntrada AND fechaSalida "
                + "OR ? BETWEEN fechaEntrada AND fechaSalida "
                + "OR fechaEntrada BETWEEN ? AND ?))";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cantPer);
            ps.setDate(2, Date.valueOf(checkIn));
            ps.setDate(3, Date.valueOf(checkOut));
            ps.setDate(4, Date.valueOf(checkIn));
            ps.setDate(5, Date.valueOf(checkOut));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habi = new Habitacion();
                habi.setIdHabitacion(rs.getInt("idHabitacion"));
                TipoHabitacion tipoH = ABMH.buscarTipoHabitacion(rs.getInt("idTipoHabitacion"));
                habi.settipoHabitacion(tipoH);
                habi.setEstado(rs.getBoolean("estado"));
                disponibles.add(habi);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en buscar habitaciones reservadas");
        }
        return disponibles;
    }

    public void crearReserva(Reserva reserva) {
        String sql = "INSERT INTO `reserva`"
                + "( `idHabitacion`, `idHuesped`, `cantPersonas`, `fechaEntrada`, `fechaSalida`,"
                + " `importeTotal`, `estado`) "
                + "VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getHabitacion().getidHabitacion());
            ps.setInt(2, reserva.getHuesped().getIdHuesped());
            ps.setInt(3, reserva.getCantPersonas());
            ps.setDate(4, Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(5, Date.valueOf(reserva.getFechaSalida()));
            ps.setDouble(6, reserva.getImporteTotal());
            ps.setBoolean(7, reserva.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la reserva");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la reserva");
        }
    }

    public Reserva buscarPorId(int idR) {
        Reserva res = new Reserva();
        String sql = "SELECT * FROM reserva WHERE idReserva=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idR);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                res.setIdReserva(idR);
                Huesped hues = ABMHues.buscarHuespedPorId(rs.getInt("idHuesped"));
                res.setHuesped(hues);
                Habitacion habi = ABMH.buscarHabitacion(rs.getInt("idHabitacion"));
                res.setHabitacion(habi);
                res.setCantPersonas(rs.getInt("cantPersonas"));
                res.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                res.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                res.setImporteTotal(rs.getDouble("importeTotal"));
                res.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro reserva");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva");
        }
        return res;
    }

    public void cancelarReserva(int idR) {
        String sql = "UPDATE `reserva` SET `estado`=0 WHERE reserva.idReserva=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idR);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cancelar la reserva");
        }
    }

    public void AltaReserva(int idR) {
        String sql = "UPDATE `reserva` SET `estado`=1 WHERE reserva.idReserva=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idR);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cancelar la reserva");
        }
    }

    public List<Reserva> buscarPorHuesped(int dni) {
        List<Reserva> reservas = new ArrayList<>();
        Huesped hues = ABMHues.buscarHuesped(dni);
        String sql = "SELECT * FROM reserva WHERE estado = 1 AND reserva.idHuesped = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, hues.getIdHuesped());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setHuesped(hues);
                Habitacion habi = ABMH.buscarHabitacion(rs.getInt("idHabitacion"));
                res.setHabitacion(habi);
                res.setCantPersonas(rs.getInt("cantPersonas"));
                res.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                res.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                res.setImporteTotal(rs.getDouble("importeTotal"));
                res.setEstado(rs.getBoolean("estado"));
                reservas.add(res);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva");
        }
        if (reservas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay reservas de ese Huesped");
        }
        return reservas;
    }

    public List<Reserva> buscarTodasPorHuesped(int dni) {
        List<Reserva> reservas = new ArrayList<>();
        Huesped hues = ABMHues.buscarHuesped(dni);
        String sql = "SELECT * FROM reserva WHERE reserva.idHuesped = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, hues.getIdHuesped());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setHuesped(hues);
                Habitacion habi = ABMH.buscarHabitacion(rs.getInt("idHabitacion"));
                res.setHabitacion(habi);
                res.setCantPersonas(rs.getInt("cantPersonas"));
                res.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                res.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                res.setImporteTotal(rs.getDouble("importeTotal"));
                res.setEstado(rs.getBoolean("estado"));
                reservas.add(res);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva");
        }
        if (reservas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay reservas de ese Huesped");
        }
        return reservas;
    }

    public List<Reserva> buscarPorFechas(LocalDate entrada, LocalDate salida) {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE estado = 1 AND "
                + "(? BETWEEN fechaEntrada AND fechaSalida OR "
                + "? BETWEEN fechaEntrada AND fechaSalida)";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(entrada));
            ps.setDate(2, Date.valueOf(salida));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                Huesped hues = ABMHues.buscarHuespedPorId(rs.getInt("idHuesped"));
                res.setHuesped(hues);
                Habitacion habi = ABMH.buscarHabitacion(rs.getInt("idHabitacion"));
                res.setHabitacion(habi);
                res.setCantPersonas(rs.getInt("cantPersonas"));
                res.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                res.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                res.setImporteTotal(rs.getDouble("importeTotal"));
                res.setEstado(rs.getBoolean("estado"));
                reservas.add(res);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar reserva");
        }
        if (reservas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay reservas de ese Huesped");
        }
        return reservas;
    }

    public List<Reserva> buscarPorHabitacion(Habitacion habi) {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE reserva.idHabitacion=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, habi.getidHabitacion());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                Huesped hues = ABMHues.buscarHuespedPorId(rs.getInt("idHuesped"));
                res.setHuesped(hues);
                res.setHabitacion(habi);
                res.setCantPersonas(rs.getInt("cantPersonas"));
                res.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                res.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                res.setImporteTotal(rs.getDouble("importeTotal"));
                res.setEstado(rs.getBoolean("estado"));
                reservas.add(res);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No hay reservas para esa habitación");
        }
        return reservas;
    }

    public double calcularPrecioEstadia(LocalDate entrada, LocalDate salida, Habitacion habi) {
        double montoTotal = 0;
        int diasEstadia = (int) (ChronoUnit.DAYS.between(entrada, salida));
        double porNoche = habi.gettipoHabitacion().getPrecioNoche();
        montoTotal = diasEstadia * porNoche;
        return montoTotal;
    }

    public void modificarReserva(Reserva res) { // para la interfaz grafica, recordar ver problemas de fechas que choquen entre la reserva modificada y reservas ya hechas anteriores
        String sql = "UPDATE reserva SET idHabitacion = ? , idHuesped = ?, cantPersonas = ?, "
                + "fechaEntrada = ?, fechaSalida = ?, importeTotal = ? WHERE idReserva = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, res.getHabitacion().getidHabitacion());
            ps.setInt(2, res.getHuesped().getIdHuesped());
            ps.setInt(3, res.getCantPersonas());
            ps.setDate(4, Date.valueOf(res.getFechaEntrada()));
            ps.setDate(5, Date.valueOf(res.getFechaSalida()));
            ps.setDouble(6, res.getImporteTotal());
            ps.setInt(7, res.getIdReserva());
            int registro = ps.executeUpdate();
            if (registro == 0) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la reserva");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la reserva");
        }
    }
}
