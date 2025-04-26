package exer_emsala_3;

import java.time.LocalDate;
import java.time.Period;



public class Cliente extends Pessoa {
    private LocalDate dataCadastro;

    public Cliente(String nome, int idade, LocalDate dataCadastro) {
        super(nome, idade);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public int getTempoCadastro() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataCadastro, hoje);
        return periodo.getYears(); 
    }
}
