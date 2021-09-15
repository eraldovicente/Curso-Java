package org.aguzman.appfacturas;

import org.aguzman.appfacturas.modelo.Cliente;
import org.aguzman.appfacturas.modelo.Factura;
import org.aguzman.appfacturas.modelo.ItemFactura;
import org.aguzman.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Eraldo");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
        String nombre;

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
