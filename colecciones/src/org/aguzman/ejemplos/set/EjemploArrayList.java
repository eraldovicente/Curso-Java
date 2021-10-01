package org.aguzman.ejemplos.set;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("Está vacia = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));

        System.out.println(al + ", size = " + al.size());

        //al.remove(new Alumno("Jano", 7));
        al.remove(2);
        System.out.println(al + ", size = " + al.size());

        boolean b = al.contains(new Alumno("Jano", 7));
        System.out.println("La lista contiene a Jano = " + b);

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}
