public class Ceo implements Pessoa {

    private String nome;
    private String titulacao;

    public Ceo(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }


    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCeo(this);
    }

}
