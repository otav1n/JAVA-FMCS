package com.example;

public class Main {
    public static void main(String[] args) {
        
        String descricao = "O celular iphone 11 PRO MAX tem uma tela de 6,46 polegadas.";

        String nome = "tela";

        boolean resultado = Produto.verificarPalavra(descricao, nome);

        System.out.println(descricao+"");
        if (resultado){
            System.out.println("A palavra "+ nome +" foi encontrada na descricao.");
        } else {
            System.out.println("A palavra "+ nome +" não foi encontrada na descricao");
        }
    }
}