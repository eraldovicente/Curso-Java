public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementoBuscar = 15;
        boolean encotrado = false;

        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j] == elementoBuscar) {
                    encotrado = true;
                    break buscar;
                }
            }
        }

        if (encotrado) {
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + ", " + j);
        } else {
            System.out.println(elementoBuscar + " no se encontro en la matriz");
        }
    }
}
