package com.example;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Otavio123", "senha123");
        Usuario usuario2 = new Usuario("Augusto456", "12345");

        System.out.println("Senha de " + usuario1.getNomeUsuario() + " é válida? " + usuario1.senhaValida());
        System.out.println("Senha de " + usuario2.getNomeUsuario() + " é válida? " + usuario2.senhaValida());
    }
}