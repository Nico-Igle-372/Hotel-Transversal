package Main;

import AccesoADatos.ABMHabitacion;
import AccesoADatos.ABMHuesped;
import AccesoADatos.ABMReserva;
import AccesoADatos.Conexion;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.TipoHabitacion;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HotelTransversal {
    public static void main(String[] args) {
        
        Conexion con=new Conexion("jdbc:mariadb://localhost:3306/", "hotel31", "root", "");
//        Huesped h=new Huesped("Iglesias Nicolas","Beltran 1778","nico-igle@gmail.com",36452738, 2804354313L, true);
        ABMHuesped abmH=new ABMHuesped();
        ABMHabitacion dataHabi = new ABMHabitacion();
        ABMReserva dataRes = new ABMReserva();
        TipoHabitacion tipoH = dataHabi.buscarTipoHabitacion(2);
        Habitacion habi = dataHabi.buscarHabitacion(4);
//        abmH.guardarHuesped(h);
//        abmH.listarHuespedes();
//        for(Huesped listahues:abmH.listarHuespedes()){
//            System.out.println(listahues);
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
    }
}