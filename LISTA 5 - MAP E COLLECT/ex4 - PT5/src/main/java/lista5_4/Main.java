package lista5_4;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, "Otavio", 250.75),
                new Pedido(2, "Gabriel", 450.50),
                new Pedido(3, "Luiz", 150.00),
                new Pedido(4, "Matheus", 350.90)
        );

        List<PedidoDTO> pedidosDTO = pedidos.stream()
                .map(p -> new PedidoDTO(p.getId(), p.getValorTotal())) 
                .collect(Collectors.toList());

        System.out.println("Lista de PedidoDTO:");
        pedidosDTO.forEach(System.out::println);
    }
}