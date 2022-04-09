package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermometroTest {

    @Test
    void deveRetornarFahrenheit() {
        Termometro termometro = new Termometro();
        termometro.setMedida(1f);

        assertEquals(33.8f, termometro.getMedida());
    }

    @Test
    void  deveRetornarCelsius() {
        Termometro termometro = new Termometro();
        termometro.setMedida(1f);

        assertEquals(1f, termometro.getMedidaCelsius());
    }

}