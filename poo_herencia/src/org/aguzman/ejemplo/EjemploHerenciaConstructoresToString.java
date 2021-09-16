package org.aguzman.ejemplo;

import org.aguzman.pooherencia.Alumno;
import org.aguzman.pooherencia.AlumnoInternacional;
import org.aguzman.pooherencia.Persona;
import org.aguzman.pooherencia.Profesor;

public class EjemploHerenciaConstructoresToString {
    public static void main(String[] args) {

        System.out.println("====== Creando la instancia de la clase Alumno ======");
        Alumno alumno = new Alumno("Eraldo", "Vicente", 1, "Udemy");
        alumno.setNotaCastellano(0.1);
        alumno.setNotaHistoria(0.2);
        alumno.setNotaMatematica(0.3);
        alumno.setEmail("eraldo@correo.com");

        System.out.println("====== Creando la instancia de la clase AlumnoInternacional ======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Anna", "Vanina", "Russia - Samara");
        alumnoInt.setEdad(28);
        alumnoInt.setInstitucion("...");
        alumnoInt.setNotaIdiomas(10);
        alumnoInt.setNotaCastellano(0.0);
        alumnoInt.setNotaHistoria(10);
        alumnoInt.setNotaMatematica(10);
        alumnoInt.setEmail("Anna@correo.com");

        System.out.println("====== Creando la instancia de la clase Profesor ======");
        Profesor profesor = new Profesor("Andres", "Guzman", "Desenvolvimento de Software");
        profesor.setEdad(41);
        profesor.setEmail("profesor@correo.com");

        System.out.println("====== - ======");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
    }
}
