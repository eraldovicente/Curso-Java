package org.aguzman.app.jardin;

import org.aguzman.app.hogar.*;
import static org.aguzman.app.hogar.Persona.saludar;
import static org.aguzman.app.hogar.Persona.GENERO_MASCULINO;
import static org.aguzman.app.hogar.ColorPelo.CAFE;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Eraldo");
        p.setApellido("Vicente");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMasculino = GENERO_MASCULINO;
    }
}
