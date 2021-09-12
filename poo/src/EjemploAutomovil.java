import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son igualesc con equals? " + (nissan.equals(nissan2)));

        System.out.println(subaru.verDetalle() + "\n");
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(auto.equals(fecha));
        System.out.println(auto.equals(nissan));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60f));

        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 60f));
    }
}
