import java.util.Observable;
import java.util.Observer;

public class Funcionario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void contratar(Setor setor) {
        setor.addObserver(this);
    }

    public void update(Observable setor, Object arg1) {
        this.ultimaNotificacao = this.nome + ", feedback " + setor.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
