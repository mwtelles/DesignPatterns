package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Ninjutsus extends Selos {

    private List<Selos> selos;

    public Ninjutsus(String descricao) {
        super(descricao);
        this.selos = new ArrayList<Selos>();
    }

    public void addCompetencia(Selos selos) {
        this.selos.add(selos);
    }

    public String getSelos() {
        String saida = "";
        saida = "Ninjutsu: " + this.getElementos() + "\n";
        for(Selos selos : this.selos) {
            saida += selos.getSelos();
        }

        return saida;
    }


}
