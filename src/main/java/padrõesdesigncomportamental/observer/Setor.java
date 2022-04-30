import java.util.Observable;

public class Setor extends Observable {

    private Integer ano;
    private Integer semestre;
    private String nomeDepartamento;
    private String nomeSetor;

    public Setor(Integer ano, Integer semestre, String nomeDepartamento, String nomeSetor) {
        this.ano = ano;
        this.semestre = semestre;
        this.nomeDepartamento = nomeDepartamento;
        this.nomeSetor = nomeSetor;
    }

    public void feedback() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Setor{" +
                "ano=" + ano +
                ", semestre=" + semestre +
                ", nomeDepartamento='" + nomeDepartamento + '\'' +
                ", nomeSetor='" + nomeSetor + '\'' +
                '}';
    }
}
