package org.aguzman.java8.lambda;

import org.aguzman.java8.lambda.aritmetica.Aritmetica;
import org.aguzman.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computer(10, 5, suma));
        System.out.println(cal.computer(10, 5, resta));
        System.out.println(cal.computer(10, 5, (a, b) -> a * b));

        System.out.println(cal.computerConBiFunction(10, 5, (a, b) -> a + b));
    }
}
