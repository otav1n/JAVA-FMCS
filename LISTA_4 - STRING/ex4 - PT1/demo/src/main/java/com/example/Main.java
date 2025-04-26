package com.example;

public class Main {
    public static void main(String[] args) {
        
        String remetente = "Remetente enviou uma mensagem!";
        String destinatario = "Destinatario recebeu uma mensagem!";
        String mensagem = "Sucesso é a soma de pequenos esforcos repetidos diariamente. Que a sua empresa continue crescendo e inovando!";

        System.out.println("Email: "+ remetente);
        System.out.println("Email: "+ destinatario);
        System.out.println("MSG: "+ mensagem);
        System.out.println("Quantidade de palavras: " + mensagem.split(" ").length);


    }
}