import java.util.Arrays;

public class EjemploArregloForInversoMutable {
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64GB",
                "Samsung Galaxy",
                "Disco duro SSD Samsung",
                "Asus Notebook",
                "MacBook Air",
                "Chromecast 4ta generación",
                "Bicicleta Oxford"};

        int total = productos.length;

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        /*for(int i = 0; i < total/2; i++) {
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }

        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }*/

        int total2 = productos.length;
        for(int i = 0; i < total2; i++) {
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
            total2--;
        }

        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}
