package org.aguzman.poointerfaces;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.repositorio.*;
import org.aguzman.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.aguzman.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.aguzman.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.aguzman.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import org.aguzman.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Eraldo", "Vicente"));
            repo.crear(new Cliente("Fabiana", "Paes"));
            repo.crear(new Cliente("Gabriel", "Santana"));
            Cliente edna = new Cliente("Edna", "Olímpio");
            repo.crear(edna);
            repo.crear(edna);

//            repo.crear(null);

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println("====== paginable ======");
            List<Cliente> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);

            System.out.println("====== ordenar ======");
            List<Cliente> clientesOrdenAsc =
                    repo.listar("nombre", Direccion.ASC);
            for (Cliente c : clientesOrdenAsc) {
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

        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura:" + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Generica: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
