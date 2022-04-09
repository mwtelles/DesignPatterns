package padroesestruturais.bridge;

public class ArtistaMarcial extends Personagem{

    public ArtistaMarcial(float danoBase) {
        super(danoBase);
    }

    public float calcularDano() {
        return this.danoBase * (1 + this.raca.percentualAumento());
    }
}
