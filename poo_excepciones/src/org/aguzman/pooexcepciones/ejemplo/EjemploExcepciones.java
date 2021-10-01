package org.aguzman.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        try {

            double division2 = cal.dividir(numerador, denominador);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detecto una exceptión: ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
        } catch (DivisionPorZeroException e) {
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin!");
        }
        System.out.println("Continuamos con el flujo de la aplicacción!");
    }
}
