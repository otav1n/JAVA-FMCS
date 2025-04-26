package com.example;

public class Main {
    public static void main(String[] args) {
       URL url = new URL("https://youtube.com");
       String Endereco = "https://youtube.com";

       System.out.println("Endereço: "+ Endereco);
       url.VerificarEndereco(url.Endereco);

    }
}