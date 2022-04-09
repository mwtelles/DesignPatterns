package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaquinasTest {

    @Test
    public void deveRetornarIp() {
        Maquinas.getInstance().setIp("179.107.136.35");
        assertEquals("179.107.136.35", Maquinas.getInstance().getIp());
    }

    @Test
    public void deveRetornarSenha() {
        Maquinas.getInstance().setSenha("password");
        assertEquals("password", Maquinas.getInstance().getSenha());
    }

}