package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Junior";
        String Sobrenome = "Nobrega";


        Pessoa completo = new Pessoa(nome, Sobrenome);

        completo.NomeCompleto();
    }
}