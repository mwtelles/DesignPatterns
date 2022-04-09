package padroesestruturais.composite;

public class Jutsus extends Selos {

    public Jutsus(String descricao) {
        super(descricao);
    }

    public String getSelos() {
        return "Habilidade: " + this.getElementos() + "\n";
    }


}
