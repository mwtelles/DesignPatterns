package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessaoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Sessao sessao = new Sessao("Sonic 2: O Filme", "Aventura", "1h 32min", "2D - Dublado","15h40min", 12.0, "Sala 01");

        Sessao sessaoClone = sessao.clone();
        sessaoClone.setHorario("18h10min");
        sessaoClone.setValor(24.5);

        assertEquals("Sessao{filme=Sonic 2: O Filme, genero='Aventura', duracao='1h 32min', formato='2D - Dublado', horario='15h40min', valor=12.0, sala='Sala 01'}", sessao.toString());

        assertEquals("Sessao{filme=Sonic 2: O Filme, genero='Aventura', duracao='1h 32min', formato='2D - Dublado', horario='18h10min', valor=24.5, sala='Sala 01'}", sessaoClone.toString());

    }

}