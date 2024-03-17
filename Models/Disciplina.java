package Models;

import java.util.HashSet;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private static int limiteAlunos = 10;
    private int quantidadeAlunos = 0;
    private HashSet<Aluno> alunos = new HashSet<Aluno>();

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < limiteAlunos) {
            alunos.add(aluno);
            aluno.adcionarDisciplina(this);

            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Limite de alunos atingido. Disciplina lotada!");
        }
    }

    public void removerAluno(int matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
        quantidadeAlunos--;
        System.out.println("Aluno removido com sucesso!");
    }

    public HashSet<Aluno> getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public static int getLimiteAlunos() {
        return limiteAlunos;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    @Override
    public String toString() {
        return "Discisplina: " + nome;
    }
}