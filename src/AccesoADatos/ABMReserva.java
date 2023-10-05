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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ABMReserva {

    private Connection conn;
    private ABMHabitacion ABMH = new ABMHabitacion();

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
                + "OR ? BETWEEN fechaEntrada AND fechaSalida))";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cantPer);
            ps.setDate(2, Date.valueOf(checkIn));
            ps.setDate(3, Date.valueOf(checkOut));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
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
    // cancelar reserva, buscar reserva por huesped, buscar reserva por fecha, calcular monto estadia, lista reservas, modificar reserva

}
