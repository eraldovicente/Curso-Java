public class HolaMundo {
    public static void main(String[] args) {

        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2;
        if(valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero);

        var numero3 = "15";

        String nombre;

        nombre = "Eraldo";

        if(numero > 10) {
          nombre = "Gabriel";
        }

        System.out.println("nombre = " + nombre);

    }
}
