package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarContratoEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("contrato estagiario", funcionario.imprimirContrato());
    }

    @Test
    void deveRetornarFuncoesEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Funções do estagiario", funcionario.imprimiBeneficios());
    }
}
