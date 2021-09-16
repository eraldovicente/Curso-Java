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

        System.out.println("Sumar long: " + cal.sumar(10L, 5L));
        System.out.println("Sumar int: " + cal.sumar(10, '@'));
        System.out.println("Sumar float-int: " + cal.sumar(10F, '@'));
    }
}
