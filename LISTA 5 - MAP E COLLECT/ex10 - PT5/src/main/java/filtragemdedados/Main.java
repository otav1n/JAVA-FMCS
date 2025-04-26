package filtragemdedados;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    
        List<Vendedor> vendedores = Arrays.asList(
                new Vendedor("Matheus", 8000.00),
                new Vendedor("Gabriel", 12000.00),
                new Vendedor("Otavvio", 30000.00),
                new Vendedor("Luiz", 9999.99)
        );

        List<Vendedor> FiltroVendedores = vendedores.stream()
            .filter(v -> v.getTotalVendas() > 10000.00)
            .collect(Collectors.toList());

        
        Optional<Vendedor> maiorVenda = vendedores.stream()
            .collect(Collectors.maxBy(Comparator.comparingDouble(Vendedor::getTotalVendas)));

        
        Optional<Vendedor> menorVenda = vendedores.stream()
            .collect(Collectors.minBy(Comparator.comparingDouble(Vendedor::getTotalVendas)));

        
        List<String> VendedoresNomes = vendedores.stream()
            .map(Vendedor::getNome)
            .collect(Collectors.toList());

        System.out.println("Vendedores com vendas acima de R$ 10.000,00:");
        FiltroVendedores.forEach(v -> System.out.println(v.getNome()));

        maiorVenda.ifPresent(v -> System.out.println("\nMaior venda: " + v.getTotalVendas() + " (" + v.getNome() + ")"));
        menorVenda.ifPresent(v -> System.out.println("Menor venda: " + v.getTotalVendas() + " (" + v.getNome() + ")"));

        System.out.println("\nNomes dos vendedores:");
        VendedoresNomes.forEach(System.out::println);
    }
}
