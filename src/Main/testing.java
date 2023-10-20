package Main;
public class testing {
    public static void main(String[] args) {
        String prueba = "   dasdasd@gmail.com   ";
        if (prueba.matches("[-\\w\\.]+@\\D+\\.\\D{3}+")) {
//            System.out.println(prueba);
        }
        System.out.println(prueba);
        System.out.println(prueba.trim());
        
    }
}