package padroesestruturais.flyweight;

public class Pessoa {

    private String nome;
    private UfNatal ufNatal;

    public Pessoa(String nome, UfNatal ufNatal) {
        this.nome = nome;
        this.ufNatal = ufNatal;
    }

    public String obterPessoa() {
        return "Membro {" +
                "nome='" + this.nome + '\'' +
                ", UF='" + ufNatal.getNome() + '\'' +
                ", Regiao='" + ufNatal.getRegiao() + '\'' +
                '}';
    }
}
