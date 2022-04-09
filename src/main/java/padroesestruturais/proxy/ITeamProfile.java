package padroesestruturais.proxy;

import java.util.List;

public interface ITeamProfile {
    List<String> obterDados();
    List <Integer> obterTitulos(User user);
}