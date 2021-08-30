public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal == caracter);

        char simbolo = '0';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0820';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte a = " + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char corresponde en bites a = " + Character.SIZE);
        System.out.println("máximo valor para char = " + Character.MAX_VALUE);
        System.out.println("minimo valor para char = " + Character.MIN_VALUE);
    }
}
