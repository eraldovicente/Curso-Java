package org.aguzman.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en común del tipo Persona: ");
        System.out.println("Nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email:" + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institución: " + ((Alumno)persona).getInstitucion());
            System.out.println("Nota Matemáticas: " + ((Alumno)persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno)persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno)persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional)persona).getPais());
            }
            System.out.println("=============== sobre escritura promedio ==============");
            System.out.println("Promedio: " + ((Alumno)persona).calcularPromedio());
            System.out.println("=============== sobre escritura promedio ==============");
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor)persona).getAsignatura());
        }
        System.out.println("=============== sobre escritura saludar ==============");
        System.out.println(persona.saludar());
        System.out.println("=======================");
    }
}
