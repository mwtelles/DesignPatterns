package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorBuilderTest {

    @Test
    void deveRetornarExcecaoParaUsuarioInvalido() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder.setEmail("Pessoa@hotmail.com").build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Usuario invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEmailInvalido() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder.setUsuario("Pessoa").build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Email invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPessoaValida() {
        JogadorBuilder jogadorBuilder = new JogadorBuilder();
        Jogador jogador = jogadorBuilder.setEmail("Pessoa@hotmail.com").setUsuario("Pessoa").build();

        assertNotNull(jogador);
    }

}