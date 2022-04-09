package padroesestruturais.decorator;

public class Pause extends PartidaDecorator {

    public Pause(Partida partida) {
        super(partida);
    }

    public float getAumentoDuracao() {
        return 2.50f;
    }

    public String getNomeEstrutura() {
        return "Pause";
    }
}
