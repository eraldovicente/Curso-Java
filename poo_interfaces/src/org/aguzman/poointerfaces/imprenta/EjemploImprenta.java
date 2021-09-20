package org.aguzman.poointerfaces.imprenta;

import org.aguzman.poointerfaces.imprenta.modelo.*;
import static org.aguzman.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("John Doe", "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador fullstack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro("Erich Gamma",
                "Patrones de diseños: Elem. Reusables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));


        Informe informe = new Informe("Martin Fowler",
                "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
