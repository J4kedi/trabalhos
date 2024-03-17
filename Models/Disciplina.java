package Models;

import java.util.HashSet;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private static int limiteAlunos = 10;
    private HashSet<Aluno> alunos = new HashSet<Aluno>();

    public Disciplina(String nome, int cargaHoraria, Professor professor){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        if (professor.getCodRH() != 0) {
            this.professor = professor;
        } else {
            throw new IllegalArgumentException("Erro: Professor precisa ser contratado primeiro!");
        }
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno.getMatricula() == 0) {
            throw new IllegalArgumentException("Erro: Aluno precisa ser matriculado primeiro!");
        }

        if (alunos.size() < limiteAlunos) {
            alunos.add(aluno);
            aluno.adcionarDisciplina(this);

            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Limite de alunos atingido. Disciplina lotada!");
        }
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        System.out.println("Aluno removido com sucesso!");
    }

    public void substituirProfessor(Professor professor){
        this.professor = professor;
    }

    public void imprimirInfo() {
        System.out.print("\n--------INFO DISCIPLINA--------\n");
        System.out.print(toString() + "\nProfessor: " + professor.getNome() + "\n");
        System.out.println("Alunos: " + alunos);
        System.out.print("-------------------------------\n\n");
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

    @Override
    public String toString() {
        return "Disciplina: " + nome;
    }
}