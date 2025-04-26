package concatenarstrings;

public class Pessoa implements Descritivel {
    
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDescricao() {
        return nome;
    }
}

