package com.example;

public class Idioma {
    private String frase;

    public Idioma(String frase) {
        this.frase = frase;
    }

    public boolean verificarPortugues() {
        
        String[] palavrasChave = {"o", "a", "é", "de", "do", "da", "um", "uma", "e", "não", "sim", "mas", "porque", "para", "como", "com"};

        
        String[] palavras = frase.toLowerCase().split("\\W+");

        
        for (String palavra : palavras) {
            for (String chave : palavrasChave) {
                if (palavra.equals(chave)) {
                    return true;
                }
            }
        }
        return false;
    }
}