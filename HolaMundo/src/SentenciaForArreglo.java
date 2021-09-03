public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("andres")){
                continue;
            }
            System.out.println( i + ".-" + nombres[i]);
        }
    }
}
