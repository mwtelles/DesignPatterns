package padroescriacao.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VistoAmericanoTest {

    @Test
    void deveAprovarVistoAmericano() {
        Visto visto = VistoFactory.obterVisto("Americano");
        assertEquals("Visto Americano aprovado", visto.aprovar());
    }

    @Test
    void deveReprovarVistoAmericano() {
        Visto visto = VistoFactory.obterVisto("Americano");
        assertEquals("Visto Americano reprovado", visto.reprovar());
    }
}