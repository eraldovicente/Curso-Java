package org.aguzman.poointerfaces.imprenta;

import org.aguzman.poointerfaces.imprenta.modelo.Curriculo;
import org.aguzman.poointerfaces.imprenta.modelo.Hoja;
import org.aguzman.poointerfaces.imprenta.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("John Doe", "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador fullstack");
        cv.addExperiencia("Angular");

        Informe informe = new Informe("Martin Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
