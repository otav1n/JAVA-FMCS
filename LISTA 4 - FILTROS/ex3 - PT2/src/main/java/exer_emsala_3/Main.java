package exer_emsala_3;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        // Criando uma lista de clientes
        List<Cliente> clientes = Arrays.asList(
                new Cliente("João", 30, LocalDate.of(2015, 3, 10)),
                new Cliente("Maria", 25, LocalDate.of(2018, 6, 25))
            
        );

        // Filtrando clientes com mais de 5 anos de cadastro usando Stream API
        List<Cliente> clientesFiltrados = clientes.stream()
                .filter(cliente -> cliente.getTempoCadastro() > 5)
                .collect(Collectors.toList());

        // Exibindo nome e tempo de cadastro
        for (Cliente cliente : clientesFiltrados) {
            System.out.println("Nome: " + cliente.getNome() + ", Tempo de Cadastro: " + cliente.getTempoCadastro() + " anos");
        }
    }
}