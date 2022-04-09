package padroesestruturais.decorator;

public class overTime extends PartidaDecorator {

    public overTime(Partida partida) {
        super(partida);
    }

    public float getAumentoDuracao() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Overtime";
    }
}
