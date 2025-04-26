package lista5_1;

abstract class ItemLoja implements Vendavel {
    private int id;
    private String nome;

    public ItemLoja(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public abstract double getPreco();
}
