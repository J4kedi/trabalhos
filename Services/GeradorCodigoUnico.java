package Services;

import java.util.HashSet;
import java.util.Set;

public class GeradorCodigoUnico{
    private int codigo;
    private Set<Integer> codigosGerados = new HashSet<>();

    public int gerarCod() {
        do {
            codigo = (int) (Math.random() * 1000000);
        } while (codigosGerados.contains(codigo));
        
        codigosGerados.add(codigo);

        return codigo;
    }
    
    public Set<Integer> getCodigosGerados() {
        return codigosGerados;
    }
}
