package com.example;

import java.util.ArrayList;
import java.util.List;

public class Texto {
    private List<String> frases;

    public Texto() {
        this.frases = new ArrayList<>();
    }

    public void adicionarFrase(String frase) {
        frases.add(frase);
    }

    public void exibirFrasesComPalavra(String palavra) {
        for (String frase : frases) {
            if (frase.contains(palavra)) {
                System.out.println(frase);
            }
        }
    }
}