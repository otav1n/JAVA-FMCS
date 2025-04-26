package lista5_1;

class Roupas extends ItemLoja {
    private double preco;

    public Roupas(int id, String nome, double preco) {
        super(id, nome);
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}