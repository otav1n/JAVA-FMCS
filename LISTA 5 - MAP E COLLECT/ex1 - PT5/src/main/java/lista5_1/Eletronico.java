package lista5_1;

class Eletronico extends ItemLoja {
    private double preco;

    public Eletronico(int id, String nome, double preco) {
        super(id, nome);
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}