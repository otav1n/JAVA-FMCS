package conversaodelista;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<Produto> pdts = Arrays.asList(
                new Produto(1, "Mouse", 30.00),
                new Produto(2, "Iphone", 3000.00),
                new Produto(3, "Monster", 9.99)
        );

    
        Map<Integer, Produto> mapaProdutos = pdts.stream()
            .collect(Collectors.toMap(Produto::getId, p -> p));

    
        mapaProdutos.forEach((id, produto) -> 
            System.out.println("ID: " + id + ", Produto: " + produto.getNome()));
    }
}
