package padroesestruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static Map<Integer, TeamProfile> perfis = new HashMap<>();

    public static TeamProfile getPerfil(Integer idade) {
        return perfis.get(idade);
    }

    public static void addPerfil(TeamProfile perfil) {
        perfis.put(perfil.getNumeroJogadores(), perfil);
    }
}