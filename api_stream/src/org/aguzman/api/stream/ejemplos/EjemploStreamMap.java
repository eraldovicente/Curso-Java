package org.aguzman.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);


    }
}
