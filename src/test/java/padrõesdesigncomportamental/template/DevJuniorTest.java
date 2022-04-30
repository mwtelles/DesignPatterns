import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DevJuniorTest {

    @Test
    void deveRetornarPromovido() {
        DevJunior dev = new DevJunior();
        dev.setSkill1(6.0f);
        dev.setSkill2(6.0f);
        assertEquals("Promovido", dev.verificarPromocao());
    }

    @Test
    void deveRetonarNaoPromovido() {
        DevJunior dev = new DevJunior();
        dev.setSkill1(6.0f);
        dev.setSkill2(5.9f);
        assertEquals("Nao Promovido", dev.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        DevJunior dev = new DevJunior();
        dev.setSkill1(6.0f);
        dev.setSkill2(7.9f);
        dev.setNome("Camila");
        dev.setCpf(123456);
        assertEquals("Dev{cpf=123456, nome='Camila', resultado=Promovido}", dev.getInfo());
    }
}