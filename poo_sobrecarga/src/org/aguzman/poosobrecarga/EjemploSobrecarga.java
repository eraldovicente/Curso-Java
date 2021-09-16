package org.aguzman.poosobrecarga;
import static org.aguzman.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar int: " + sumar(10, 5));
        System.out.println("Sumar float: " + sumar(10.0F, 5F));
        System.out.println("Sumar float-int: " + sumar(10F, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5.0F));
        System.out.println("Sumar double: " + sumar(10, 5));
        System.out.println("Sumar string: " + sumar("10", "5"));
        System.out.println("Sumar tres int: " + sumar(10, 5, 3));
        System.out.println("Sumar 4 int: " + sumar(10, 5, 3, 4));
        System.out.println("Sumar 5 int: " + sumar(10, 5, 3, 4, 5));
        System.out.println("Sumar float + n int: " + sumar(10.5F, 5, 9, 15));
        System.out.println("Sumar 4 double: " + sumar(10.0, 5.0, 3.5, 4.5));

        System.out.println("Sumar long: " + sumar(10L, 5L));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("Sumar float-int: " + sumar(10F, '@'));
    }
}
