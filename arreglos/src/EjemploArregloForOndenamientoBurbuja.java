import java.util.Arrays;

public class EjemploArregloForOndenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64GB",
                "Samsung Galaxy",
                "Disco duro SSD Samsung",
                "Asus Notebook",
                "MacBook Air",
                "Chromecast 4ta generación",
                "Bicicleta Oxford"};

        int total = productos.length;

        int contador = 0;

        for(int i = 0; i < total - 1; i++) {
            for(int j = 0; j < total - 1 - i; j++) {
                if(productos[j+1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 3L;
        numeros[3] = 4;

        int totalNum = numeros.length;
        for(int i = 0; i < totalNum - 1; i++) {
            for(int j = 0; j < totalNum - 1 - i; j++) {
                if( ((Comparable) numeros[j+1]).compareTo(numeros[j]) < 0) {
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
            }
        }

        for(int i = 0; i < totalNum; i++) {
            System.out.println("i = " + i + " : " + i);
        }
    }
}
