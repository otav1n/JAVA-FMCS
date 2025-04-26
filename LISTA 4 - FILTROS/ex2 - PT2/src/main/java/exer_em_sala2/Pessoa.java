package exer_em_sala2;
public abstract class Pessoa implements Entidade {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Implementação do método getNome() da interface Entidade
    @Override
    public String getNome() {
        return nome;
    }

    // Métodos para obter os atributos
    public int getIdade() {
        return idade;
    }
}
