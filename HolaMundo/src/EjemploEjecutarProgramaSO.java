import java.io.IOException;
import java.util.Locale;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            } else {
                proceso = rt.exec("vim");
            }
            proceso.waitFor();
        } catch (Exception e) {
            System.out.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
