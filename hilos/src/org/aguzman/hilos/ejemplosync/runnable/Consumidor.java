package org.aguzman.hilos.ejemplosync.runnable;

import org.aguzman.hilos.ejemplosync.Panaderia;

public class Consumidor implements Runnable {
    private Panaderia panadaria;

    public Consumidor(Panaderia panadaria) {
        this.panadaria = panadaria;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            panadaria.consumir();
        }
    }
}
