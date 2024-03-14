package Models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private static List<Disciplina> disciplinas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public static List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getMatricula() {
        return matricula;
    }
}
