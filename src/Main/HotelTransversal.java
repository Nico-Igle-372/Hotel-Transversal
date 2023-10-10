package Main;

import AccesoADatos.ABMHabitacion;
import AccesoADatos.ABMHuesped;
import AccesoADatos.ABMReserva;
import AccesoADatos.Conexion;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.TipoHabitacion;
import Interfaz.Principal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HotelTransversal {

    public static void main(String[] args) {


        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
