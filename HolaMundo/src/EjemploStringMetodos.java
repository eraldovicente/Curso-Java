import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Eraldo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Eraldo\") = " + nombre.equals("Eraldo"));
        System.out.println("nombre.equals(\"eraldo\") = " + nombre.equals("eraldo"));
        System.out.println("nombre.equalsIgnoreCase(\"eraldo\") = " + nombre.equalsIgnoreCase("eraldo"));
        System.out.println("nombre.compareTo(\"Eraldo\") = " + nombre.compareTo("Eraldo"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(4, 5) = " + nombre.substring(4, 5));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
    }
}
