import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursosHumanosTest {

    RecursosHumanos rh;
    Contrato contrato;

    @BeforeEach
    void setUp() {
        rh = new RecursosHumanos();
        contrato = new Contrato (2021, 1);
    }

    @Test
    void deveAbrirContrato() {
        Tarefa aberturaContrato = new EfetuarContratoTarefa(contrato);
        rh.executarTarefa(aberturaContrato);

        assertEquals("Contrato efetuado", contrato.getSituacao());
    }

    @Test
    void deveFecharContrato() {
        Tarefa finalizacaoContrato = new FinalizarContratoTarefa(contrato);
        rh.executarTarefa(finalizacaoContrato);

        assertEquals("Contrato finalizado", contrato.getSituacao());
    }

    @Test
    void deveCancelarFechamentoContrato() {
        Tarefa aberturaContrato = new EfetuarContratoTarefa(contrato);
        Tarefa finalizacaoContrato = new FinalizarContratoTarefa(contrato);

        rh.executarTarefa(aberturaContrato);
        rh.executarTarefa(finalizacaoContrato);

        rh.cancelarUltimaTarefa();

        assertEquals("Contrato efetuado", contrato.getSituacao());
    }

}