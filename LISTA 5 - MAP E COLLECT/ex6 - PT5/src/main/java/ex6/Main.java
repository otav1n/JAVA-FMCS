package ex6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = Arrays.asList(
            new Cliente("Luiz", 19),
            new Cliente("Matheus", 17),
            new Cliente("Gabriel", 35),
            new Cliente("Otavio", 40)
        );

        List<Cliente> adultos = clientes.stream()
            .filter(c -> c.getIdade() > 18)
            .collect(Collectors.toList());
        
        long clientesMaisDe30 = clientes.stream()
            .filter(c -> c.getIdade() > 30)
            .count();
        
        List<String> nomesClientes = clientes.stream()
             .map(Cliente::getNome)
             .collect(Collectors.toList());

        System.out.println("Clientes maiores de 18 anos: " + adultos);
        System.out.println("Quantidade de clientes com mais de 30 anos: " + clientesMaisDe30);
        System.out.println("Lista de nomes dos clientes: " + nomesClientes);
    }
}