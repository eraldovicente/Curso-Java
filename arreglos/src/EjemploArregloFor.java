import java.util.Arrays;

public class EjemploArregloFor {
    public static void main(String[] args) {

        String[] productos = new String[7];

        int total = productos.length;

        productos[0] = "Kingston pendrive 64GB";
        productos[1]= "Samsung Galaxy";
        productos[2]= "Disco duro SSD Samsung Externo";
        productos[3]= "Asus Notebook";
        productos[4]= "MacBook Air";
        productos[5]= "Chromecast 4ta generación";
        productos[6]= "Bicicleta Oxford";

        Arrays.sort(productos);
        for(int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }
        System.out.println("=== Usando foreach ===");
        for (String prod :
                productos) {
            System.out.println("prod = " + prod);
        }
        System.out.println("=== Usando while ===");
        int i = 0;
        while (i < total) {
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }
        System.out.println("=== Usando do while ===");
        int j = 0;
        do {
            System.out.println("para indice " + j + " : " + productos[i]);
            j++;
        } while (j < total);

        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int k = 0; k < total; k++) {
            numeros[k] = k*3;
        }
        for(int k = 0; k < total; k++) {
            System.out.println("numeros = " + numeros[k]);
        }
    }
}
