package exer_emsala5;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        
        List<Funcionario> funcionarios = Arrays.asList(
            new Funcionario("Carlos", 30, 3000, "TI"),
            new Funcionario("Ana", 25, 4500, "RH"),
            new Funcionario("João", 40, 6000, "TI"),
            new Funcionario("Mariana", 28, 2500, "Financeiro"),
            new Funcionario("Ricardo", 35, 4000, "TI")
        );

        List<Funcionario> funcionariosFiltrados = funcionarios.stream()
            .filter(f -> f.getSalario() >= 2000 && f.getSalario() <= 5000)
            .collect(Collectors.toList());

  
        Map<String, List<Funcionario>> agrupadosPorDepartamento = funcionariosFiltrados.stream()
            .collect(Collectors.groupingBy(Funcionario::getDepartamento));

        
        for (Map.Entry<String, List<Funcionario>> entry : agrupadosPorDepartamento.entrySet()) {
            System.out.println("Departamento: " + entry.getKey());
            for (Funcionario f : entry.getValue()) {
                System.out.println("Nome: " + f.getNome() + ", Salário: " + f.getSalario());
            }
        }
    }
}
