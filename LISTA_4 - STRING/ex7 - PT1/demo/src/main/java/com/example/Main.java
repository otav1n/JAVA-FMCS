package com.example;

public class Main {
    public static void main(String[] args) {
        Senha senha = new Senha("SenhaMuit@top123");

        System.out.println(Senha.verificarSenha(senha.getValor()));

    }
}