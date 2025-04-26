package com.example;

public class Senha {

    public String valor;

    // construtor

    public Senha (String valor){
        this.valor = valor;
    }

    // metodo get 

    public String getValor(){
        return valor;
    }

    // metodo verificar caractere 

    public static String verificarSenha(String valor) {
        if (valor == null || valor.isEmpty()) {
            return "A senha está vazia ou nula.";
        }

        if (valor.contains("@")) {
            return "A senha contém '@'.";
        } else if (valor.contains("#")) {
            return "A senha contém '#'.";
        } else if (valor.contains("$")) {
            return "A senha contém '$'.";
        } else if (valor.contains("%")) {
            return "A senha contém '%'.";
        } else if (valor.contains("&")) {
            return "A senha contém '&'.";
        } else if (valor.contains("*")) {
            return "A senha contém '*'.";
        } else if (valor.contains("!")) {
            return "A senha contém '!'.";
        } else if (valor.contains("?")) {
            return "A senha contém '?'.";
        } else {
            return "A senha NÃO contém caracteres especiais.";
        }
    }
    
    }

    

