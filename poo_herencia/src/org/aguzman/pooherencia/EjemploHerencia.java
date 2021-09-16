package org.aguzman.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Eraldo");
        alumno.setApellido("Vicente");

        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Desenvolvimento de Software");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());
    }
}
