package org.aguzman.hilos.ejemplos;

import org.aguzman.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {

        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
        };

        new Thread(viaje, "Isla de Pascua").start();
        new Thread(viaje, "Robison Crusoe").start();
        new Thread(viaje, "Juan Fernandes").start();
        new Thread(viaje, "Isla de Chiloe").start();
    }
}
