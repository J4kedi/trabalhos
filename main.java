import java.util.ArrayList;
import java.util.List;

import Models.Aluno;
import Models.Disciplina;
import Models.Professor;

public class main {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("matemática", 80);
        Professor jorge = new Professor("Jorge");
        Professor maicris = new Professor("maicris");
        Aluno kauan = new Aluno("Kauan");

        System.out.println(jorge.getCodRH());
        System.out.println(Professor.getCodigosRH());


        matematica.adicionarAluno(kauan);
        System.out.println(kauan.getMatricula());

        System.out.println(matematica.getAlunos());

        System.out.println(Aluno.getDisciplinas());
    }
}