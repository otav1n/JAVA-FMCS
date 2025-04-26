package com.example;

public class Main {
    public static void main(String[] args) {
        
        String texto = "Java é complexo, mas é legal.";

        System.out.println("Texto Normal: "+ texto);

        System.out.println("Texto Invertido: "+ Frase.textoInvertido(texto));
    }
}