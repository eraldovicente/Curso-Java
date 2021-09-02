public class SentenciaSwitchCase {
    public static void main(String[] args) {
        byte num = 1;

        switch(num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Número desconocido");
        }

        String nombre = "andres";

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "andres":
                System.out.println("Hola andres!");
                break;
            case "pepe":
                System.out.println("hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido!");
        }
    }
}
