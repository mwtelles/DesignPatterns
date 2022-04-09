package padroesestruturais.decorator;

public abstract class PartidaDecorator implements Partida {

    private Partida partida;
    public String estrutura;

    public PartidaDecorator(Partida partida) {
        this.partida = partida;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public abstract float getAumentoDuracao();

    public float getDuracao() {
        return this.partida.getDuracao() + this.getAumentoDuracao();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.partida.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void  setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
