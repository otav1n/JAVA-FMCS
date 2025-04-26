package lista5_1;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       
        List<ItemLoja> produtos = Arrays.asList(
                new Eletronico(1, "Keyboard", 250.00),
                new Roupas(2, "Mouse", 50.00),
                new Eletronico(3, "Notebook", 2500.00),
                new Roupas(4, "Mouse pad", 30.00),
                new Eletronico(5, "Fone de Ouvido", 80.00)
        );

        List<String> produtosAcimaDe100 = produtos.stream()
                .filter(n -> n.getPreco() > 100) 
                .map(ItemLoja::getNome)        
                .collect(Collectors.toList());   

        
        System.out.println("Produtos com preço acima de R$ 100,00:");
        produtosAcimaDe100.forEach(System.out::println);
    }
}