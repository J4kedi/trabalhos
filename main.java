import Models.Disciplina;
import Models.Professor;

public class main {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("matematica", 80);
        Professor jorge = new Professor("Jorge");
        Professor maicris = new Professor("maicris");

        System.out.println(jorge.getCodRH());
        System.out.println(Professor.getCodigosRH());

    }
}