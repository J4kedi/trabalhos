package Models;

import java.util.HashSet;

public class Aluno {
    private String nome;
    private int matricula; 
    private static HashSet<Disciplina> disciplinas = new HashSet<>();

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public void adcionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public static HashSet<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome;
    }
}