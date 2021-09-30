package org.aguzman.genericsclass;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion) {
        for (T a: camion) {
            if (a instanceof Animal) {
                System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());
            }
            else if (a instanceof Automovil) {
                System.out.println(((Automovil)a).getMarca());
            } else if (a instanceof Maquinaria) {
                System.out.println(((Maquinaria)a).getTipo());
            }
        }
    }
    public static void main(String[] args) {

        Camion<Animal> transporteCavallos = new Camion<>(5);
        transporteCavallos.add(new Animal("Peregrino", "Caballo"));
        transporteCavallos.add(new Animal("Grilo", "Cavallo"));
        transporteCavallos.add(new Animal("Tunquen", "Cavallo"));
        transporteCavallos.add(new Animal("Topocalma", "Cavallo"));
        transporteCavallos.add(new Animal("Longotoma", "Cavallo"));

        imprimirCamion(transporteCavallos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transAuto);
    }
}
