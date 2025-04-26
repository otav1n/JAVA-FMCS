package com.example;

public class Palavra {

    private String conteudo;

    public Palavra(String conteudo) {
        this.conteudo = conteudo;
    }


    public int contarVogais() {
        int count = 0;

        for (int i = 0; i < conteudo.length(); i++) {

            char letra = conteudo.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                count++;

            }

        }

        return count;

    }
}
