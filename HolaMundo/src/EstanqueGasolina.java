import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite medida actual del estanque de gasolina");
        int litros = s.nextInt();

        if ( litros >= 1 && litros < 20 ) {
            System.out.println("Insuficiente");
        } else if ( litros >= 20 && litros < 35 ) {
            System.out.println("Suficiente");
        } else if ( litros >= 35 && litros < 40 ) {
            System.out.println("Medio Estanque");
        } else if ( litros >= 40 && litros < 60 ) {
            System.out.println("Estanque 3/4");
        } else if ( litros >= 60 && litros < 70 ) {
            System.out.println("Estanque casi lleno");
        } else if ( litros == 70 ) {
            System.out.println("Estanque lleno");
        } else {
            System.out.println("Medida fora do limite");
        }
    }
}
