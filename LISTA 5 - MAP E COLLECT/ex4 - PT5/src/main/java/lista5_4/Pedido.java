package lista5_4;

class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;

    // Construtor
    public Pedido(int id, String cliente, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", cliente='" + cliente + "', valorTotal=" + valorTotal + '}';
    }
}