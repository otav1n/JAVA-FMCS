package com.example;

public class URL {

    public String Endereco;


    public URL(String Endereco){
        this.Endereco = Endereco;
    }

    public void VerificarEndereco(String endereco){

        if (endereco.startsWith("https://")){
            System.out.println("A frase começa com https://");
        } else {
            System.out.println("A frase não começa com https://");
        }
    }

}
