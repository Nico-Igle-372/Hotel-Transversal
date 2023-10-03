package Main;



import AccesoADatos.ABMHuesped;
import AccesoADatos.Conexion;
import Entidades.Huesped;


public class HotelTransversal {
    public static void main(String[] args) {
        
        Conexion con=new Conexion("jdbc:mariadb://localhost:3306/", "hotel31", "root", "");
        Huesped h=new Huesped("Kerlin Michael","Coldaroli 949","Kerlin@gmail.com",38018000,154749769, true);
        ABMHuesped abmH=new ABMHuesped();
//        abmH.guardarHuesped(h);
//        abmH.listarHuespedes();
//        for(Huesped listahues:abmH.listarHuespedes()){
//            System.out.println(listahues);
//        }
//            System.out.println(abmH.buscarHuesped(38018000));
//          abmH.altaHuesped(38018311);

        abmH.modificarHuesped(h);
    }
}