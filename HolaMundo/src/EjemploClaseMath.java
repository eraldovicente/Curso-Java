public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);
    }
}
