package com.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FormatoData {
    private String dataString;

    // Construtor
    public FormatoData(String dataString) {
        this.dataString = dataString;
    }


    public String converterFormato() {
        try {

            DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate data = LocalDate.parse(dataString, formatoEntrada);
            return data.format(formatoSaida);
        } catch (DateTimeParseException e) {
            return "Formato de data inválido!";
        }
    }
}
