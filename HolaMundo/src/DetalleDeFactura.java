import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a descrição da fatura: ");
        String faturaDesc = "";
        faturaDesc = scanner.nextLine();

        System.out.println("Digite o primeiro preço: ");
        double primeiroPreco = 0;
        try {
            primeiroPreco = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("Digite o segundo preço: ");
        double segundoPreco = 0;
        try {
            segundoPreco = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        double total = primeiroPreco + segundoPreco;

        double totalImpuesto = total * .19;

        double totalConImpuesto = total + totalImpuesto;

        System.out.println("La factura " + faturaDesc + " tiene un total bruto de " + total + ", con un impuesto " + totalImpuesto + " y el monto despuès de impuesto es de " + totalConImpuesto);

    }
}
