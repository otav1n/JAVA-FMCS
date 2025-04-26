package com.example;

public class Email {

    public String remetente;
    public String destinatario;
    public String mensagem;

    // construtor

    public Email(String remetente, String destinatario, String mensagem){
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getRemetente(String remetente){
        return remetente;
    }

    public String getDestinatario(String destinatario){
        return destinatario;
    }

    public String getMensagem(String mensagem){
        return mensagem;
    }

}
