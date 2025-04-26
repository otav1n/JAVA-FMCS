package lista5_2;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Luiz", 8.5, 20),
                new Aluno("Matheus", 6.0, 22),
                new Aluno("Otavio", 7.5, 21),
                new Aluno("Gabriel", 9.0, 19),
                new Aluno("Marcos", 5.5, 23)
        );

      
        List<String> alunosAprovados = alunos.stream()
                .filter(p -> p.getNota() >= 7)
                .sorted(Comparator.comparing(Aluno::getNota).reversed() 
                        .thenComparing(Aluno::getIdade)) 
                .map(Aluno::getNome) 
                .collect(Collectors.toList()); 
        System.out.println("Alunos aprovados em ordem");
        alunosAprovados.forEach(System.out::println);
    }
}