package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlacaVeiculo {

    private String codigoPlaca;

    //construtor

    public PlacaVeiculo(String codigoPlaca) {
        this.codigoPlaca = codigoPlaca;
    }

    // metodo validar

    public boolean validarPlaca() {
        String padrao = "^[A-Z]{3}-\\d{4}$"; // 3 letras + hifen + 4 numeros
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(this.codigoPlaca);
        return matcher.matches();
    }

    // metodo get set
    
    public String getCodigoPlaca() {
        return codigoPlaca;
    }

    public void setCodigoPlaca(String codigoPlaca) {
        this.codigoPlaca = codigoPlaca;
    }

}
