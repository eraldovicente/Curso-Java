public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        System.out.println(subaru.verDetalle() + "\n");
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(subaru.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60f));

        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 60f));
    }
}
