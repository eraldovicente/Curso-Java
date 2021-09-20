package org.aguzman.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {

    private String autor;
    private String revisor;

    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + autor
                + " Revisado por: " + revisor
                + "\n" + this.contenido;
    }
}
