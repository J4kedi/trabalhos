package Models;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private static int limiteAlunos = 10;
    private int quantidadeAlunos = 0;
    private Aluno alunos[] = new Aluno[limiteAlunos];

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    public Aluno[] getAlunos() {
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
}
