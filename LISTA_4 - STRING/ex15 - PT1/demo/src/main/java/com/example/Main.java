package com.example;


public class Main {
    public static void main(String[] args) {
        FormatoData data1 = new FormatoData("21/03/2025");
        FormatoData data2 = new FormatoData("05/12/1999");
        FormatoData dataInvalida = new FormatoData("31-02-2023"); 

        System.out.println("Data convertida: " + data1.converterFormato());
        System.out.println("Data convertida: " + data2.converterFormato());
        System.out.println("Data convertida: " + dataInvalida.converterFormato());
    }
}