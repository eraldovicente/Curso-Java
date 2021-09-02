import javax.swing.*;

public class MayorNombre {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Digite nombre completo (nombre + apellido) del familiar");
        String nombre2 = JOptionPane.showInputDialog("Digite nombre completo (nombre + apellido) del segundo familiar");
        String nombre3 = JOptionPane.showInputDialog("Digite nombre completo (nombre + apellido) del tercer familiar");

        String[] split1 = nombre1.split(" ");
        String[] split2 = nombre2.split(" ");
        String[] split3 = nombre3.split( " ");

        if (split1.length > split2.length && split1.length > split3.length) {
            System.out.println(nombre1 + " tiene el nombre más largo.");
        } else if (split2.length > split1.length && split2.length > split3.length) {
            System.out.println(nombre2 + " tiene el nombre más largo.");
        } else {
            System.out.println(nombre3 + " tiene el nombre más largo.");
        }
    }
}

