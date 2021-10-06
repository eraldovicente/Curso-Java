package org.aguzman.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal! " + param;
        String resultado = f1.apply("Eraldo");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Eraldo"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("eraldo", "vicente");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo; //(a, b) -> a.compareTo(b);
        System.out.println(f4.apply("eraldo", "eraldo"));

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("eraldo", "vicente"));
    }
}
