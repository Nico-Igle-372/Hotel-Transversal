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
import org.mariadb.jdbc.Statement;

public class ABMReserva {

    private Connection conn;
    private ABMHabitacion ABMH = new ABMHabitacion();
    private ABMHuesped ABMHues=new ABMHuesped();

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
    
    public void crearReserva(Reserva reserva){
        String sql="INSERT INTO `reserva`"
       + "( `idHabitacion`, `idHuesped`, `cantPersonas`, `fechaEntrada`, `fechaSalida`,"
       + " `importeTotal`, `estado`) "
       + "VALUES (?,?,?,?,?,?,?)";
        
        PreparedStatement ps=null;
        
        try {
            ps=conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,reserva.getHabitacion().getidHabitacion());
            ps.setInt(2,reserva.getHuesped().getIdHuesped());
            ps.setInt(3,reserva.getCantPersonas());
            ps.setDate(4,Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(5,Date.valueOf(reserva.getFechaSalida()));
            ps.setDouble(6, reserva.getImporteTotal());
            ps.setBoolean(7, reserva.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                reserva.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Reserva generada");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo crear la reserva");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al crear la reserva");
        }
    }
    
    public void cancelarReserva(int idR){
       
        String sql="UPDATE `reserva` SET `estado`=0 WHERE reserva.idReserva=?";
        PreparedStatement ps=null;
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(1, idR);
            int registro=ps.executeUpdate();
            if(registro==1){
                JOptionPane.showMessageDialog(null, "Reserva cancelada");
            }else{
                JOptionPane.showMessageDialog(null, "No existe esa reserva");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al cancelar la reserva");
        }
  
    }
    
    
    
    // cancelar reserva, buscar reserva por huesped, buscar reserva por fecha, calcular monto estadia, lista reservas, modificar reserva
    
}
