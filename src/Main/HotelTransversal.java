package Main;


import Interfaz.Principal;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkMediumIJTheme;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class HotelTransversal {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            FlatGruvboxDarkMediumIJTheme.setup();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falló al iniciar FlatLaf");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });

//        Conexion con=new Conexion("jdbc:mariadb://localhost:3306/", "hotel31", "root", "");
////        Huesped h=new Huesped("Iglesias Nicolas","Beltran 1778","nico-igle@gmail.com",36452738, 2804354313L, true);
//        ABMHuesped abmH=new ABMHuesped();
//        ABMHabitacion dataHabi = new ABMHabitacion();
//        ABMReserva dataRes = new ABMReserva();
//        TipoHabitacion tipoH = dataHabi.buscarTipoHabitacion(2);
//        Habitacion habi = dataHabi.buscarHabitacion(4);
////        abmH.guardarHuesped(h);
////        abmH.listarHuespedes();
////        for(Huesped listahues:abmH.listarHuespedes()){
////            System.out.println(listahues);
//        }
//            System.out.println(abmH.buscarHuesped(38018000));
//          abmH.altaHuesped(38018311);                        
//        abmH.modificarHuesped(h);
//        dataHabi.crearHabitacion(habi);
////        dataHabi.cambiarPrecio(1, 30000);
//    dataHabi.liberarHabitacion(4);
//    dataHabi.liberarHabitacion(6);
//dataHabi.ocuparHabitacion(5);
//        System.out.println(dataHabi.listaDesocupadas());
//dataHabi.modificarHabitacion(habi, 2);
//        System.out.println(dataRes.buscarHabitacionParaReserva(2, LocalDate.of(2023, 10, 04), LocalDate.of(2023, 10, 9)));
//        dataRes.cancelarReserva(1);
//        System.out.println(dataRes.buscarPorHuesped(36452738));
//        int diasEstadia = (int) (ChronoUnit.DAYS.between(LocalDate.of(2023, 9, 04), LocalDate.of(2023, 10, 9)));
//        System.out.println(diasEstadia);
//        System.out.println(dataRes.calcularPrecioEstadia(LocalDate.of(2023, 10, 04), LocalDate.of(2023, 10, 9), habi));
//        dataHabi.listaOcupadas();
    }

}
