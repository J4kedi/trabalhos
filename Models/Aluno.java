package Models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private static List<Integer> matriculas = new ArrayList<>();
    private static List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
        gerarMatricula();
    }
    
    public void gerarMatricula() {
        matricula = (int) (Math.random() * 1000000);

        if (matriculas.contains(matricula)) {
            gerarMatricula();
        }

        matriculas.add(matricula);
    }

    public void adcionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }


    public static List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
