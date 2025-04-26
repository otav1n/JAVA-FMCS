package com.example;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Livro> livros = Arrays.asList(
                new Livro("Fundamentos da Física", "David Halliday", 120.50),
                new Livro("Mecânica Clássica", "Herbert Goldstein", 150.75),
                new Livro("Eletromagnetismo", "David J. Griffiths", 99.90),
                new Livro("Relatividade: A Teoria Especial e a Geral", "Albert Einstein", 59.90),
                new Livro("Feynman: O Prazer de Descobrir", "Richard Feynman", 80.00),
                new Livro("Termodinâmica", "Enrico Fermi", 110.00)
        );

        List<String> titulos = livros.stream()
                .map(Livro::getTitulo)
                .collect(Collectors.toList());

        String titulosConcatenados = titulos.stream()
                .collect(Collectors.joining(" | "));

        System.out.println("\n Títulos concatenados:");
        System.out.println(titulosConcatenados);

        System.out.println("\n Lista de títulos:");
        titulos.forEach(System.out::println);

        List<Livro> livrosOrdenadosPorPreco = livros.stream()
                .sorted(Comparator.comparing(Livro::getPreco))
                .collect(Collectors.toList());

        System.out.println("\n Livros ordenados por preço (crescente):");
        livrosOrdenadosPorPreco.forEach(System.out::println);

        List<Livro> livrosOrdenadosPorAutor = livros.stream()
                .sorted(Comparator.comparing(Livro::getAutor))
                .collect(Collectors.toList());

        System.out.println("\n Livros ordenados pelo nome do autor (ordem alfabética):");
        livrosOrdenadosPorAutor.forEach(System.out::println);
    }
}