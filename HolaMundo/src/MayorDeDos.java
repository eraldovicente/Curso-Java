import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite un número");
        int num1 = s.nextInt();

        System.out.println("Digite un número");
        int num2 = s.nextInt();

        String resultado = (num1 > num2)
                ? "Lo número " + num1 + "es mayor que " + num2
                : "Lo número " + num2 + "es mayor que " + num1;

        System.out.println(resultado);
    }
}
