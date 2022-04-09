package padroescriacao.prototype;

public class Sessao implements Cloneable {
    private String filme;
    private String genero;
    private String duracao;
    private String formato;
    private String horario;
    private double valor;
    private String sala;

    public Sessao(String filme, String genero, String duracao, String formato, String horario, double valor, String sala) {
        this.filme = filme;
        this.genero = genero;
        this.duracao = duracao;
        this.formato = formato;
        this.horario = horario;
        this.valor = valor;
        this.sala = sala;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getGenero() { return genero;}

    public void setGenero(String genero) { this.genero = genero; }

    public String getDuracao() { return duracao;}

    public void setDuracao(String duracao) { this.duracao = duracao; }

    public String getFormato() { return formato;}

    public void setFormato(String formato) { this.formato = formato; }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public Sessao clone() throws CloneNotSupportedException {
        Sessao sessaoClone = (Sessao) super.clone();
       //sessaoClone.sala = (String) sessaoClone.sala.clone();
        return sessaoClone;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "filme=" + filme +
                ", genero='" + genero + '\'' +
                ", duracao='" + duracao + '\'' +
                ", formato='" + formato + '\'' +
                ", horario='" + horario + '\'' +
                ", valor=" + valor +
                ", sala='" + sala + '\'' +
                '}';
    }

}
