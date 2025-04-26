package exer_emsala_4;
public class Produto extends Produto_base {
    private double preco;

    // Construtor
    public Produto(String nome, int quantidadeEmEstoque, double preco) {
        super(nome, quantidadeEmEstoque);
        this.preco = preco;
    }

    // Método adicional
    public double getPreco() {
        return preco;
    }

    public boolean estaEmEstoque() {
        return getQuantidadeEmEstoque() > 0;
    }
}
