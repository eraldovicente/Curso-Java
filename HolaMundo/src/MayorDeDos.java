import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {

        int max = 0;
        int min = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite un número");
        int num1 = s.nextInt();

        System.out.println("Digite un número");
        int num2 = s.nextInt();

        max = (num1 > num2) ? num1 : num2;
        min = (num1 < num2) ? num1 : num2;

        System.out.println("O número " + max + " maior que " + min);
    }
}
