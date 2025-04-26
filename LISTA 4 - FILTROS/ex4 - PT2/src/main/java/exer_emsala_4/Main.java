package exer_emsala_4;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        // Criação da lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto A", 10, 20.5));
        produtos.add(new Produto("Produto B", 0, 15.0));
        produtos.add(new Produto("Produto C", 5, 30.0));
        produtos.add(new Produto("Produto D", 3, 25.0));


        List<Produto> produtosEmEstoque = produtos.stream()
            .filter(Produto::estaEmEstoque) 
            .sorted(Comparator.comparingDouble(Produto::getPreco)) 
            .collect(Collectors.toList());

       
        System.out.println("Produtos em estoque (ordenados por preço):");
        for (Produto produto : produtosEmEstoque) {
            System.out.println("Nome: " + produto.getNome() +
                               ", Quantidade em estoque: " + produto.getQuantidadeEmEstoque() +
                               ", Preço: R$ " + produto.getPreco());
        }
    }
}