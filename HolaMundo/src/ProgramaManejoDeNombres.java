import java.util.Locale;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        String nombre1 = "Fabiana";
        String nombre2 = "Gabriel";
        String nombre3 = "Edna";

        String nombreTransf1 = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length() - 2));
        String nombreTransf2 = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length() - 2));
        String nombreTransf3 = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length() - 2));
        
        String concatenando = nombreTransf1 + "_" + nombreTransf2 + "_" + nombreTransf3;

        System.out.println("concatenando = " + concatenando);

    }
}
