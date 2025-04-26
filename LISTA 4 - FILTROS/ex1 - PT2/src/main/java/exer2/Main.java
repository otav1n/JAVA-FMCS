package exer2;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Ana", 25));
        clientes.add(new Cliente("Carlos", 35));
        clientes.add(new Cliente("Beatriz", 40));
        clientes.add(new Cliente("João", 28));

        List<Cliente> clientesFiltrados = clientes.stream()
            .filter(cliente -> cliente.getIdade() > 30)
            .collect(Collectors.toList());

        System.out.println("Clientes com mais de 30 anos:");
        for (Cliente cliente : clientesFiltrados) {
            System.out.println(cliente.getNome());
        }
    }
}
