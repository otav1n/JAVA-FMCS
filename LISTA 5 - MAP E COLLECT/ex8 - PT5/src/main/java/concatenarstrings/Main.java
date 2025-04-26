package concatenarstrings;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Gabriel"),
                new Pessoa("Otavio"),
                new Pessoa("Luiz"),
                new Pessoa("Mathues")
        );

        List<String> descricaoP = pessoas.stream()
            .map(Pessoa::getDescricao)
            .collect(Collectors.toList());
            
        String resultado = descricaoP.stream()
            .collect(Collectors.joining(", "));

        System.out.println(resultado);
    }
}
