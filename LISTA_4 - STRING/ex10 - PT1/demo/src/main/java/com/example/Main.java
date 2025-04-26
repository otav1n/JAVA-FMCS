 package com.example;

public class Main {
    public static void main(String[] args) {

                Palavra palavra = new Palavra("Eu gosto muito de seguranca cibernetica.");
                String conteudo = "Eu gosto muito de seguranca cibernetica.";

                System.out.println(""+ conteudo);
                int totalVogais = palavra.contarVogais();
                System.out.println("Numero de vogais na frase: " + totalVogais);
            }
    }
