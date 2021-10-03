package org.aguzman.hilos.ejemplos;

import org.aguzman.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("Robison Crusoe")).start();
        new Thread(new ViajeTarea("Juan Fernandes")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();
    }
}
