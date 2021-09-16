package org.aguzman.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println("Sumar int: " + cal.sumar(10, 5));
        System.out.println("Sumar float: " + cal.sumar(10.0F, 5F));
        System.out.println("Sumar float-int: " + cal.sumar(10F, 5));
        System.out.println("Sumar int-float: " + cal.sumar(10, 5.0F));
        System.out.println("Sumar double: " + cal.sumar(10, 5));
        System.out.println("Sumar string: " + cal.sumar("10", "5"));
        System.out.println("Sumar tres int: " + cal.sumar(10, 5, 3));
        System.out.println("Sumar 4 int: " + cal.sumar(10, 5, 3, 4));
        System.out.println("Sumar 5 int: " + cal.sumar(10, 5, 3, 4, 5));
        System.out.println("Sumar float + n int: " + cal.sumar(10.5F, 5, 9, 15));
        System.out.println("Sumar 4 double: " + cal.sumar(10.0, 5.0, 3.5, 4.5));

        System.out.println("Sumar long: " + cal.sumar(10L, 5L));
        System.out.println("Sumar int: " + cal.sumar(10, '@'));
        System.out.println("Sumar float-int: " + cal.sumar(10F, '@'));
    }
}
