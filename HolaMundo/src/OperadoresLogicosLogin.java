import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

//        String[] usernames = new String[2];
//        String[] passwords = new String[2];
//
//        usernames[0] = "Andres";
//        passwords[0] = "12345";
//
//        usernames[1] = "admin";
//        passwords[1] = "12345";
//
//        usernames[2] = "Eraldo";
//        passwords[2] = "12345";

        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"12345", "12345", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String  p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++ ) {
            if( usernames[i].equals(u) && passwords[i].equals(p) ) {
                esAutenticado = true;
                break;
            } else {
                System.out.println("Username o contraseña incorrectos!");
            }
        }


        if(esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
