package lista5_3;

class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters
    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

}