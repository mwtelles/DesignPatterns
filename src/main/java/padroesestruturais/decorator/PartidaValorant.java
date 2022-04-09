package padroesestruturais.decorator;

public class PartidaValorant implements Partida {

    public float duracao;

    public PartidaValorant(float duracao) {
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }

    public String getEstrutura() {
        return "Jogo: Valorant";
    }


}
