package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartidaTest {

    @Test
    void deveRetornarDuracaoDaPartida() {
        Partida partida = new PartidaValorant(90.0f);

        assertEquals(90.0f, partida.getDuracao());
    }

    @Test
    void deveRetornarPartidaComPause() {
        Partida partida = new Pause(new PartidaValorant(90.0f));

        assertEquals(92.5f, partida.getDuracao());
    }

    @Test
    void deveRetornarPartidaComPauseOvertime() {
        Partida partida = new overTime(new Pause(new PartidaValorant(90.0f)));

        assertEquals(102.5f, partida.getDuracao());
    }

    @Test
    void deveRetornarEstrutura() {
        Partida partida = new PartidaValorant(90.0f);

        assertEquals("Jogo: Valorant", partida.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComPause() {
        Partida partida = new Pause(new PartidaValorant(90.0f));

        assertEquals("Jogo: Valorant/Pause", partida.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComPauseOvertime() {
        Partida partida = new overTime(new Pause(new PartidaValorant(90.0f)));

        assertEquals("Jogo: Valorant/Pause/Overtime", partida.getEstrutura());
    }
}