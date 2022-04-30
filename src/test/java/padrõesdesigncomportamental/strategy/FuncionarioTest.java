import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveSomarSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.somarSalario(80.0f, 20.0f);
        assertEquals(100.0f, funcionario.getSalario());
    }

    @Test
    void deveSubtrairSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.subtrairSalario(80.0f, 10.0f);
        assertEquals(70.0f, funcionario.getSalario());
    }

    @Test
    void deveMultiplicarSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.multiplicarSalario(80.0f, 1.1f);
        assertEquals(88.0f, funcionario.getSalario());
    }





}