package ex7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Notebook", 3500.0),
            new Produto("Smartphone", 2200.0),
            new Produto("Tablet", 1500.0),
            new Produto("Monitor", 800.0)
        );

        Optional<Produto> produtoMaisCaro = produtos.stream()
            .collect(Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco)));

        Optional<Produto> produtoMaisBarato = produtos.stream()
            .collect(Collectors.minBy(Comparator.comparingDouble(Produto::getPreco)));
        
        List<String> nomesProdutos = produtos.stream()
            .map(Produto::getNome)
            .collect(Collectors.toList());

        produtoMaisCaro.ifPresent(produto ->
            System.out.println("Produto mais caro: " + produto.getNome() + " - R$ " + produto.getPreco()));
        
        produtoMaisBarato.ifPresent(produto ->
            System.out.println("Produto mais barato: " + produto.getNome() + " - R$ " + produto.getPreco()));
            System.out.println("Lista de nomes dos produtos: " + nomesProdutos);
    }
}