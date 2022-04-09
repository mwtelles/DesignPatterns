package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UFFactory {
    private static Map<String, UfNatal> uf = new HashMap<>();

    public  static UfNatal getUF(String nome, String regiao) {
        UfNatal ufNatal = uf.get(nome);
        if(ufNatal == null) {
            ufNatal = new UfNatal(nome, regiao);
            uf.put(nome, ufNatal);
        }
        return ufNatal;
    }

    public static int getTotalUF() {
        return uf.size();
    }
}
