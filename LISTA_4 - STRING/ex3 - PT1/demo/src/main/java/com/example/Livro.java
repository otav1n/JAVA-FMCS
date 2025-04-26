package com.example;

public class Livro {


    public String titulo;
    public String autor;

    // construtor

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }


    // metodo get

    public String getTitulo(String titulo){
        return titulo;
    }

    public String getAutor(String autor){
        return autor;
    }


}
