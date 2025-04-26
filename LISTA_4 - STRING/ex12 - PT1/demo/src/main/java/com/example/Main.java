package com.example;

public class Main {
    public static void main(String[] args) {
        Idioma texto1 = new Idioma("Olá, como você está?");
        Idioma texto2 = new Idioma("Hello, how are you?");
        

        System.out.println("Texto 1: " + texto1.verificarPortugues()); 
        System.out.println("Texto 2: " + texto2.verificarPortugues()); 
    }
}