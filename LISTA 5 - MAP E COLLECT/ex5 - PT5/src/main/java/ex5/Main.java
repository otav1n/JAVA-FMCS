package ex5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Camiseta", 99.99),
            new Produto("Shorts", 120.00),
            new Produto("Chinelo", 99.99),
            new Produto("Tenis", 400.00)
        );

        List<Double> precos = produtos.stream()
            .map(Produto::getPreco)
            .collect(Collectors.toList());
    
        double somaPrecos = produtos.stream()
            .collect(Collectors.summingDouble(Produto::getPreco));
        
        double mediaPrecos = produtos.stream()
            .collect(Collectors.averagingDouble(Produto::getPreco));

        System.out.println("Lista de preços: " + precos);
        System.out.println("Soma dos preços: " + somaPrecos);
        System.out.println("Média dos preços: " + mediaPrecos);
    }
}