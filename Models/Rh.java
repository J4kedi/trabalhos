package Models;

import java.util.HashSet;
import java.util.Set;

import Services.GeradorCodigoUnico;

public class Rh {
    private GeradorCodigoUnico gerarCodigoRh;
    private GeradorCodigoUnico geraCodigoMatricula;
    private HashSet<Professor> professores = new HashSet<Professor>();
    private HashSet<Aluno> alunos = new HashSet<Aluno>();

    public Rh() {
        this.gerarCodigoRh= new GeradorCodigoUnico();
        this.geraCodigoMatricula = new GeradorCodigoUnico();
    }

    public void contratarProfessor(Professor professor) {
        int codigoRh = gerarCodigoRh.gerarCod();

        professor.setCodRh(codigoRh);
        professores.add(professor);

        System.out.println("Professor contratado: " + professor.getNome() + " - Código RH: " + professor.getCodRH());
    }

    public void matricularAluno(Aluno aluno) {
        int codigoMatricula = geraCodigoMatricula.gerarCod();

        aluno.setMatricula(codigoMatricula);
        alunos.add(aluno);

        System.out.println("Aluno matriculado: " + aluno.getNome() + " - Número Matrícula: " + aluno.getMatricula());
    }

    public HashSet<Professor> getprofessores() {
       return professores;
    }

    public HashSet<Aluno> getAlunos() {
        return alunos;
    }

    public Set<Integer> getCodigosRh() {
        return gerarCodigoRh.getCodigosGerados();
    }

    public Set<Integer> getCodigosMatriculas() {
        return geraCodigoMatricula.getCodigosGerados();
    }
}