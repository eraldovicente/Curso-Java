package org.aguzman.poointerfaces;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Eraldo", "Vicente"));
        repo.crear(new Cliente("Fabiana", "Paes"));
        repo.crear(new Cliente("Gabriel", "Santana"));
        repo.crear(new Cliente("Edna", "Olímpio"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("====== paginable ======");
        List<Cliente> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("====== ordenar ======");
        List<Cliente> clientesOrdenAsc =
                repo.listar("nombre", Direccion.ASC);
        for (Cliente c: clientesOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("====== editar ======");
        Cliente eraldoActualizar = new Cliente("Bárbara", "Ellen");
        eraldoActualizar.setId(1);
        repo.editar(eraldoActualizar);
        Cliente eraldo = repo.porId(1);
        System.out.println(eraldo);
        System.out.println("====== listar ======");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("====== eliminar ======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("====== total ======");
        System.out.println("Total registros: " + repo.total());
    }
}
