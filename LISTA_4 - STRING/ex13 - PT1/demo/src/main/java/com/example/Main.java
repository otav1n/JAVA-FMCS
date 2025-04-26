package com.example;

public class Main {
    public static void main(String[] args) {
        Texto texto = new Texto();
        texto.adicionarFrase("O sol está brilhando.");
        texto.adicionarFrase("A lua aparece à noite.");
        texto.adicionarFrase("O sol nasce no leste.");

        System.out.println("Frases com 'sol':");
        texto.exibirFrasesComPalavra("sol");
    }
}