package lista5_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Matheus", 30, "Desenvolvedor", 5000.00),
                new Funcionario("Otavio", 25, "Analista", 4000.00),
                new Funcionario("Luiz", 28, "Desenvolvedor", 5500.00),
                new Funcionario("Gabrieç", 35, "Gerente", 8000.00),
                new Funcionario("Pedro", 40, "Gerente", 8500.00),
                new Funcionario("Felipe", 22, "Analista", 3800.00)
        );

        Map<String, List<Funcionario>> agrupadosPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo));

        System.out.println("Funcionários agrupados por cargo:");
        agrupadosPorCargo.forEach((cargo, lista) -> {
            System.out.println(cargo + ": " + lista);
        });

        List<String> nomesFuncionarios = funcionarios.stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());

        System.out.println("\nNomes dos funcionários:");
        nomesFuncionarios.forEach(System.out::println);

        Map<String, Double> mediaSalarialPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo, 
                        Collectors.averagingDouble(Funcionario::getSalario)));

        System.out.println("\nMédia salarial por cargo:");
        mediaSalarialPorCargo.forEach((cargo, media) -> {
            System.out.println(cargo + ": R$ " + String.format("%.2f", media));
        });
    }
}