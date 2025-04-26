package exer_emsala5;

public abstract class Pessoa implements Entidade {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
