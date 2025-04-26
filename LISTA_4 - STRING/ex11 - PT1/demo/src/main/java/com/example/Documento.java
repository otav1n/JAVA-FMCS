package com.example;

public class Documento {

    private String conteudo;

    public Documento(String titulo, String conteudo) {
        this.conteudo = conteudo;
    }

    public int contarPalavra(String palavra) {
        if (conteudo == null || palavra == null || palavra.isEmpty()) {
            return 0;
        }

        String[] palavras = conteudo.toLowerCase().split("\\W+");
        String palavraBusca = palavra.toLowerCase();
        int contagem = 0;

        for (String p : palavras) {
            if (p.equals(palavraBusca)) {
                contagem++;
            }
        }
        return contagem;
    }

}