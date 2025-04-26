package com.example;

public class Produto {

    public static boolean verificarPalavra(String descricao, String nome){
        return descricao.contains(nome);
    }
}
