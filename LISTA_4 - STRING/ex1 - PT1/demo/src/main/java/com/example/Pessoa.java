package com.example;

public class Pessoa {

    //atributos

    public String nome;
    public String Sobrenome;

    //metodo

    public void NomeCompleto(){
        System.out.println(nome+" "+Sobrenome);
    }

    //construtor

    public Pessoa (String nome, String Sobrenome){
        this.nome = nome;
        this.Sobrenome = Sobrenome;
    }

    //metodo get

    public String getNome (String nome){
        return nome;
    }

    public String getSobrenome (String Sobrenome){
        return Sobrenome;
    }



}
