package Models;

import java.util.HashSet;

public class Aluno {
    private String nome;
    private int matricula; 
    private static HashSet<Integer> matriculas = new HashSet<>();
    private static HashSet<Disciplina> disciplinas = new HashSet<>();

    public Aluno(String nome) {
        this.nome = nome;
        gerarMatricula();
    }
    
    public void gerarMatricula() {
        do {
            matricula = (int) (Math.random() * 1000000);
        } while (matriculas.contains(matricula));
        
        matriculas.add(matricula);
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

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}