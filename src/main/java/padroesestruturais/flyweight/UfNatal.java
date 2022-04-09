package padroesestruturais.flyweight;

public class UfNatal {

    public String nome;
    public String regiao;

    public UfNatal(String nome, String regiao) {
        this.nome = nome;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao;
    }
}
