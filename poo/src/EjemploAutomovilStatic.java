import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        Automovil.setColorPatente("verde");
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle() + "\n");
        System.out.println(mazda.verDetalle() + "\n");
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilómetros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Kilómetros por litros = " + subaru.calcularConsumoEstatico(300, 60));
        System.out.println("Kilómetros por litros = " + mazda.calcularConsumoEstatico(300, 60));
        System.out.println("Kilómetros por litros = " + nissan.calcularConsumoEstatico(300, 60));
    }
}
