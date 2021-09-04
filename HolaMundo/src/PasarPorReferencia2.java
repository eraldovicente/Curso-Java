class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Eraldo");

        System.out.println("Iniciamos el método main");
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        
        System.out.println("Finaliza el método main con los datos del persona modificados!");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
