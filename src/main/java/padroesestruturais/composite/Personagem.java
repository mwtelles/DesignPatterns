package padroesestruturais.composite;

public class Personagem {

    private Selos habilidade;

    public void setHabilidade(Selos habilidade) {
        this.habilidade = habilidade;
    }

    public String getHabilidade() {
        if (this.habilidade == null) {
            throw new NullPointerException("Personagem sem Chakra");
        }

        return this.habilidade.getSelos();
    }
}
