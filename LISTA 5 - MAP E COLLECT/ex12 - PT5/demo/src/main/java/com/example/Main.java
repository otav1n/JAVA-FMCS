package com.example;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(

                new Funcionario("Otavio", 5000, "TI"),
                new Funcionario("Matheus", 5200, "TI"),
                new Funcionario("Marcos", 4800, "TI"),
                new Funcionario("Gabriel", 4900, "TI")
                
        );


        List<Funcionario> funcionariosTI = funcionarios.stream()
                .filter(f -> "TI".equals(f.getDepartamento()))
                .collect(Collectors.toList());

        System.out.println("Funcionários do departamento TI:");
        funcionariosTI.forEach(System.out::println);


        List<Funcionario> funcionariosComAumento = funcionarios.stream()
                .map(f -> new Funcionario(f.getNome(), f.getSalario() * 1.1, f.getDepartamento()))
                .collect(Collectors.toList());

        System.out.println("\nFuncionários com aumento de 10% no salário:");
        funcionariosComAumento.forEach(System.out::println);


        Map<String, Double> totalSalariosPorDepartamento = funcionariosComAumento.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        Collectors.summingDouble(Funcionario::getSalario)
                ));

        System.out.println("\nTotal dos salários por departamento:");
        totalSalariosPorDepartamento.forEach((departamento, totalSalario) ->
                System.out.println("Departamento: " + departamento + " | Total Salários: " + totalSalario)
        );
    }
}