package com.example;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, "Otavio", "Pago"),
                new Pedido(2, "Gabriel", "Pendente"),
                new Pedido(3, "Luiz", "Pago"),
                new Pedido(4, "Matheus", "Cancelado"),
                new Pedido(5, "Guilherme", "Pendente"),
                new Pedido(6, "Leonardo", "Pago")
        );

        List<Pedido> pedidosPagos = pedidos.stream()
                .filter(p -> "Pago".equals(p.getStatus()))
                .collect(Collectors.toList());

        System.out.println("Pedidos Pagos:");
        pedidosPagos.forEach(System.out::println);


        Map<String, List<Pedido>> pedidosPorStatus = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getStatus));

        System.out.println("\nPedidos Agrupados por Status:");
        pedidosPorStatus.forEach((status, lista) -> {
            System.out.println("Status: " + status);
            lista.forEach(System.out::println);
        });
    }
}