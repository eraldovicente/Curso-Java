package org.aguzman.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion transporteCavallos = new Camion(5);
        transporteCavallos.add(new Animal("Peregrino", "Caballo"));
        transporteCavallos.add(new Animal("Grilo", "Cavallo"));
        transporteCavallos.add(new Animal("Tunquen", "Cavallo"));
        transporteCavallos.add(new Animal("Topocalma", "Cavallo"));
        transporteCavallos.add(new Animal("Longotoma", "Cavallo"));

        for (Object o: transporteCavallos) {
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }

        Camion transMaquinas = new Camion(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        for (Object o: transMaquinas) {
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        Camion transAuto = new Camion(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolet"));

        for (Object o: transAuto) {
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }
    }
}
