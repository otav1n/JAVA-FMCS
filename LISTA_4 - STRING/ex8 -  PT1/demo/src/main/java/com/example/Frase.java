package com.example;

public class Frase {

    public String texto;

    public Frase (String texto){
        this.texto = texto;
    }

    public static String textoInvertido(String texto){
        
        return new StringBuilder(texto).reverse().toString();
        
    }



}
