package padroesestruturais.bridge;

public abstract class Personagem {

    protected Raca raca;

    protected float danoBase;

    public Personagem(float danoBase) {
        this.danoBase = danoBase;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public void setDanoBase(float danoBase) {
        this.danoBase = danoBase;
    }

    public abstract float calcularDano();
}
