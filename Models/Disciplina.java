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
        if (quantidadeAlunos < limiteAlunos) {
            for(int i = 0; i < limiteAlunos; i++) {
                if(alunos[i] == null) {
                    alunos[i] = aluno;
                }
            }
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Limite de alunos atingido. Disciplina lotada!");
        }
    }

    public void removerAluno(int matricula) {
        for(Aluno aluno: alunos){
            int i = 0;

            if(aluno.getMatricula() == matricula) {
                alunos[i] = null;
                quantidadeAlunos--;
            }
        }
    }

    public Aluno[] getAlunos() {
        System.out.println(alunos);
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
