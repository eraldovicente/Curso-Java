public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.asignarFabricante("Subaru");
        subaru.asignarModelo("Impreza");
        subaru.asignarCilindrada(2.0);
        subaru.asignarColor("Blanco");

        Automovil mazda = new Automovil();
        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("Rojo");
        System.out.println("mazda.leerFabricante() = " + mazda.leerFabricante());

        System.out.println(subaru.verDetalle() + "\n");
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(subaru.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60f));
    }
}
