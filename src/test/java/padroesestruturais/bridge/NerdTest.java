package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NerdTest {

    @Test
    void deveRetornarDanoOrcNerd() {
        Raca raca = new Orc();
        Nerd mago = new Nerd(95);
        mago.setRaca(raca);
        assertEquals(493.99997f, mago.calcularDano());
    }

    @Test
    void deveRetornarDanoHumanoNerd() {
        Raca raca = new Humano();
        Nerd mago = new Nerd(95);
        mago.setRaca(raca);
        assertEquals(484.5f, mago.calcularDano());
    }

}