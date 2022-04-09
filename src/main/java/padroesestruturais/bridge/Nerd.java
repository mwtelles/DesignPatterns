package padroesestruturais.bridge;

public class Nerd extends Personagem {

    public Nerd(float danoBase) {
        super(danoBase);
    }

    public float calcularDano() {
        return this.danoBase * (5 + this.raca.percentualAumento());
    }
}
