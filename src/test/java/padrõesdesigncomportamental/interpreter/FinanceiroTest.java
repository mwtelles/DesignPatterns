import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceiroTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Financeiro financeiro = new Financeiro();
        financeiro.setFluxoCaixa1(2.0);
        financeiro.setFluxoCaixa2(5.0);

        assertEquals(9.0, financeiro.calcularFluxoCaixa());
    }

}