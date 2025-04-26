package exer_emsala_4;
public abstract class Produto_base implements Entidade {
    private String nome;
    private int quantidadeEmEstoque;

    public Produto_base(String nome, int quantidadeEmEstoque) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}
