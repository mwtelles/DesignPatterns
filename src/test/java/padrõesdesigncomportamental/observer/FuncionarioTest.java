import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveNotificarUmFuncionario() {
        Setor setor = new Setor(2021, 1, "Infraestrutura", "TI");
        Funcionario funcionario = new Funcionario("Funcionario 1");
        funcionario.contratar(setor);
        setor.feedback();
        assertEquals("Funcionario 1, feedback Setor{ano=2021, semestre=1, nomeDepartamento='Infraestrutura', nomeSetor='TI'}", funcionario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarFuncionarios() {
        Setor setor = new Setor(2021, 1, "Infraestrutura", "TI");
        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        Funcionario funcionario2 = new Funcionario("Funcionario 2");
        funcionario1.contratar(setor);
        funcionario2.contratar(setor);
        setor.feedback();
        assertEquals("Funcionario 1, feedback Setor{ano=2021, semestre=1, nomeDepartamento='Infraestrutura', nomeSetor='TI'}", funcionario1.getUltimaNotificacao());
        assertEquals("Funcionario 2, feedback Setor{ano=2021, semestre=1, nomeDepartamento='Infraestrutura', nomeSetor='TI'}", funcionario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarFuncionario() {
        Setor setor = new Setor(2021, 1, "Infraestrutura", "TI");
        Funcionario funcionario = new Funcionario("Funcionario 1");
        setor.feedback();
        assertEquals(null, funcionario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarFuncionarioSetorTI() {
        Setor setorTI = new Setor(2021, 1, "Infraestrutura", "TI");
        Setor setorRH = new Setor(2021, 1, "Recrutamento", "RH");
        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        Funcionario funcionario2 = new Funcionario("Funcionario 2");
        funcionario1.contratar(setorTI);
        funcionario2.contratar(setorRH);
        setorTI.feedback();
        assertEquals("Funcionario 1, feedback Setor{ano=2021, semestre=1, nomeDepartamento='Infraestrutura', nomeSetor='TI'}", funcionario1.getUltimaNotificacao());
        assertEquals(null, funcionario2.getUltimaNotificacao());
    }
}