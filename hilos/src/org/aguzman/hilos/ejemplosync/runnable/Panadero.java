package org.aguzman.hilos.ejemplosync.runnable;

import org.aguzman.hilos.ejemplosync.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable {
    private Panaderia panadaria;

    public Panadero(Panaderia panadaria) {
        this.panadaria = panadaria;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            panadaria.hornear("Pan n: " + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,   2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
