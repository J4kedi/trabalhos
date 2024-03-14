package Models;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private int codRH;
    private static List<Integer> codigosRH = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;
        gerarCodRH();
    }
    
    public void gerarCodRH(){
        codRH = (int) (Math.random() * 100);

        if (codigosRH.contains(codRH)){
            gerarCodRH();
        }
        
        codigosRH.add(codRH);
    }

    public String getNome() {
        return nome;
    }
    
    public int getCodRH() {
        return codRH;
    }

    public static List<Integer> getCodigosRH() {
        return Professor.codigosRH;
    }
}
