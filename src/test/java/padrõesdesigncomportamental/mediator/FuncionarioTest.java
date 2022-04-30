import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveElogiarInfraestrutura() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O Recursos Humanos agradece seu contato.\nA Infraestrutura respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Infraestrutura agradece a mensagem: Ótimo atendimento",
                funcionario.elogiarInfraestrutura("Ótimo atendimento"));
    }

    @Test
    void deveReclamarInfraestrutura() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O Recursos Humanos agradece seu contato.\nA Infraestrutura respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Infraestrutura vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                funcionario.reclamarInfraestrutura("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirInfraestrutura() {
        Funcionario funcionario = new Funcionario();
        assertEquals("O Recursos Humanos agradece seu contato.\nA Infraestrutura respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Infraestrutura vai analisar a sugestão: Ampliar horário funcionamento",
                funcionario.sugerirInfraestrutura("Ampliar horário funcionamento"));
    }

}