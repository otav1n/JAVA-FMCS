package exer_em_sala2;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Criação da lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ana", 28, 4500.00));
        funcionarios.add(new Funcionario("Carlos", 35, 6000.00));
        funcionarios.add(new Funcionario("Beatriz", 40, 7000.00));
        funcionarios.add(new Funcionario("João", 30, 3500.00));
        funcionarios.add(new Funcionario("Lucia", 45, 8000.00));

        // Filtragem dos funcionários com salário superior a R$ 5000 e ordenação por salário decrescente
        List<Funcionario> funcionariosFiltrados = funcionarios.stream()
            .filter(funcionario -> funcionario.getSalario() > 5000)
            .sorted((f1, f2) -> Double.compare(f2.getSalario(), f1.getSalario())) // Ordenação decrescente
            .collect(Collectors.toList());

        // Exibição dos resultados
        System.out.println("Funcionários com salário superior a R$ 5000:");
        for (Funcionario funcionario : funcionariosFiltrados) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: R$ " + funcionario.getSalario());
        }
    }
}
