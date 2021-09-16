package org.aguzman.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("====== Creando la instancia de la clase Alumno ======");
        Alumno alumno = new Alumno();
        alumno.setNombre("Eraldo");
        alumno.setApellido("Vicente");
        alumno.setInstitucion("Udemy");
        alumno.setNotaCastellano(0.1);
        alumno.setNotaHistoria(0.2);
        alumno.setNotaMatematica(0.3);

        System.out.println("====== Creando la instancia de la clase AlumnoInternacional ======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Anna");
        alumnoInt.setApellido("Vanina");
        alumnoInt.setPais("Russia - Samara");
        alumnoInt.setEdad(28);
        alumnoInt.setInstitucion("...");
        alumnoInt.setNotaIdiomas(10);
        alumnoInt.setNotaCastellano(0.0);
        alumnoInt.setNotaHistoria(10);
        alumnoInt.setNotaMatematica(10);

        System.out.println("====== Creando la instancia de la clase Profesor ======");
        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Desenvolvimento de Software");

        System.out.println("====== - ======");
        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido());

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais());

        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
