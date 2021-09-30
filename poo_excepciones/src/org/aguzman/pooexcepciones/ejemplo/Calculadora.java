package org.aguzman.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int dividendo) throws DivisionPorZeroException {
        if (dividendo == 0) {
            throw new DivisionPorZeroException("no se puede dividir por cero!");
        }
        return numerador/(double)dividendo;
    }
}
