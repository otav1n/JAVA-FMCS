package com.example;

public class CPF {
    private String numeroCPF;

    public CPF(String numeroCPF) {
        
        this.numeroCPF = numeroCPF.replaceAll("\\D", "");
    }

    public String formatar() {
        
        if (numeroCPF.length() == 11) {
            return String.format("%s.%s.%s-%s", 
                numeroCPF.substring(0, 3),
                numeroCPF.substring(3, 6),
                numeroCPF.substring(6, 9),
                numeroCPF.substring(9, 11));
        }
        return "CPF inválido";
    }
}
