package padroescriacao.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VistoFactoryTest {
    @Test
    void deveRetornarVistoInexistente() {
        try {
            Visto visto = VistoFactory.obterVisto("Asiatico");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Visto inexistente", e.getMessage());
        }
    }
}