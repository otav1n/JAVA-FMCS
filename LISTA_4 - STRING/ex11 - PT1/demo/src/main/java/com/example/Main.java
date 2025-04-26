package com.example;

public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento("Exemplo", "Este é um exemplo. Exemplo de teste! Sim isso esta cheio de exemplo.");
        System.out.println(doc.contarPalavra("exemplo"));  
    }
}