package com.example;



public class Main {
    public static void main(String[] args) {

        PlacaVeiculo veiculo1 = new PlacaVeiculo("ABC-1234");
        System.out.println("Placa " + veiculo1.getCodigoPlaca() + " é válida? " + veiculo1.validarPlaca());

        

    }
}