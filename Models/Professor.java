package Models;

import java.util.HashSet;

public class Professor {
    private String nome;
    private int codRH;
    private static HashSet<Integer> codigosRH = new HashSet<>();

    public Professor(String nome) {
        this.nome = nome;
        gerarCodRH();
    }
    
    public void gerarCodRH(){
        do {
            codRH = (int) (Math.random() * 1000000);
        } while (codigosRH.contains(codRH));
        
        codigosRH.add(codRH);        
    }

    public String getNome() {
        return nome;
    }
    
    public int getCodRH() {
        return codRH;
    }

    public static HashSet<Integer> getCodigosRH() {
        return codigosRH;
    }
}