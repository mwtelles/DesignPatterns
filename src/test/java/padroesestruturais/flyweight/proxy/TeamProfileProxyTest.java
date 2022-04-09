package padroesestruturais.flyweight.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroesestruturais.proxy.DataBase;
import padroesestruturais.proxy.TeamProfile;
import padroesestruturais.proxy.TeamProfileProxy;
import padroesestruturais.proxy.User;

import static org.junit.jupiter.api.Assertions.*;

public class TeamProfileProxyTest {

    @BeforeEach
    void setUp() {
        DataBase.addPerfil(new TeamProfile("Gameficada", "Em partida", "Time Profissional de E-Sports da Universidade de Vassouras", 75, 115));
        DataBase.addPerfil(new TeamProfile("Jayob", "Offline", "Time profissional de Valorant", 12, 5));
    }

    @Test
    void deveRetonarExcecaoPerfilPrivado() {
        try {
            User user = new User("Pain", false);
            TeamProfileProxy perfilProxy = new TeamProfileProxy(22);
            perfilProxy.obterTitulos(user);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Perfil Privado", e.getMessage());
        }
    }
}
