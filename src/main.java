package src;

import Models.Aluno;
import Models.Disciplina;
import Models.Professor;
import Models.Rh;

public class main {
    public static void main(String[] args) {
        Rh rh = new Rh();

        Professor jorge = new Professor("Jorge");

        rh.contratarProfessor(jorge);

        System.out.println(jorge);

        Disciplina matematica = new Disciplina("matemática", 80, jorge);
        
        Professor maicris = new Professor("maicris");
        rh.contratarProfessor(maicris);

        Aluno kauan = new Aluno("Kauan");
        rh.matricularAluno(kauan);

        Aluno alana = new Aluno("Alana");
        rh.matricularAluno(alana);

        System.out.println(jorge.getCodRH());

        System.out.println(maicris.getNome());

        matematica.adicionarAluno(kauan);
        matematica.adicionarAluno(alana);

        System.out.println(kauan.getMatricula());
        System.out.println(Aluno.getDisciplinas());

        
        System.out.println(matematica.getAlunos());
        
        matematica.imprimirInfo();

        matematica.removerAluno(alana);

        matematica.imprimirInfo();
    }
}