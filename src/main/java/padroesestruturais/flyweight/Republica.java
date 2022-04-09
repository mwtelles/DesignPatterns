package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Republica {

    private List<Pessoa> personagens = new ArrayList<>();

    public void Aceitar(String nome, String UF, String regiao) {
        UfNatal ufNatal = UFFactory.getUF(UF, regiao);
        Pessoa pessoa = new Pessoa(nome, ufNatal);
        personagens.add(pessoa);
    }

    public List<String> obterPessoa() {
        List<String> saida = new ArrayList<>();
        for (Pessoa pessoa : this.personagens) {
            saida.add(pessoa.obterPessoa());
        }
        return saida;
    }
}
