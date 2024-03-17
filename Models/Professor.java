package Models;

public class Professor{
    private String nome;
    private int codRH;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public int getCodRH() {
        return codRH;
    }

    public void setCodRh(int codRH) {
        this.codRH = codRH;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}