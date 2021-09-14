package org.aguzman.app;

import org.aguzman.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.nombre = "Eraldo";
        System.out.println(p.nombre);

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";
    }
}
