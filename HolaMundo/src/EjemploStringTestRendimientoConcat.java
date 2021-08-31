public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder();

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 500; i++) {
//            c = c.concat(a).concat(b).concat("\n"); // 500 => 5ms
//            c += a + b + "\n"; // 500 => 104ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
//        System.out.println("c = " + c);

    }
}
