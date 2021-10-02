package org.aguzman.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.put(null, "1234");
        persona.put("nombre", "Joe");
        persona.put("apellido", "Doe");
        persona.put("email", "john.Doe@email.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        //String valorApellido = persona.remove("apellido");
        boolean b = persona.remove("apellido", "Doe");
        System.out.println("eliminado " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellido");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("john.Doe@email.com");
        System.out.println("b2 = " + b2);

        System.out.println("============ values ============");
        Collection<String> valores = persona.values();
        for (String v: valores) {
            System.out.println("v = " + v);
        }

        System.out.println("=========== keySet =============");
        Set<String> llaves = persona.keySet();
        for (String k : llaves) {
            System.out.println("k = " + k);
        }

        System.out.println("=========== entrySet =============");
        for (Map.Entry<String, String> par: persona.entrySet()) {
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("=========== keySet =============");
        for (String llave: persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println("========== java 8 forEach ========");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("Total: " + persona.size());
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        boolean b3 = persona.replace("nombre", "Joe", "Eraldo");
        System.out.println("b3 = " + b3);
        persona.remove("nombre", "Andres");
        System.out.println("persona" + persona);
    }
}
