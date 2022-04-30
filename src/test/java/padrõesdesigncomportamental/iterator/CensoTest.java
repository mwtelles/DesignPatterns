
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Setor setor = new Setor(
                new Funcionario("Camila", true),
                new Funcionario("Marina", true),
                new Funcionario("Alice", false),
                new Funcionario("Isabelly", true)
                );
        assertEquals(3, Censo.contarFuncionariosAtivosSetor(setor));
    }

    @Test
    void contarTotalFuncionariosSetor() {
        Setor setor = new Setor(
                new Funcionario("Camila", true),
                new Funcionario("Marina", true),
                new Funcionario("Alice", false),
                new Funcionario("Isabelly", false)
                );
        assertEquals(4, Censo.contarTotalFuncionariosSetor(setor));
    }

}