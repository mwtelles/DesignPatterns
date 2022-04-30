import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    // Funcionario contratado

    @Test
    public void naoDeveContratarFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertEquals("Contrato não realizado", funcionario.contratar());
    }

    @Test
    public void deveDarFeriasFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertEquals("Ferias realizada", funcionario.ferias());
    }

    @Test
    public void deveDarLicencaFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertEquals("Licenca realizada", funcionario.licenca());
    }

    @Test
    public void deveDemitirFuncionarioContratado() {
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        assertEquals("Demissao realizada", funcionario.demitir());
    }


    // Funcionario de licenca

    @Test
    public void naoDeveContatarFuncionarioLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertEquals("Contrato não realizado", funcionario.contratar());
    }

    @Test
    public void naoDarFeriasFuncionarioLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertEquals("Ferias não realizada", funcionario.ferias());
    }

    @Test
    public void darLicencaFuncionarioLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertEquals("Licenca realizada", funcionario.licenca());
    }

    @Test
    public void naoDeveDemitirFuncionarioLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertEquals("Demissao não realizada", funcionario.demitir());
    }


    // Funcionario de Ferias

    @Test
    public void naoDeveContratarFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertEquals("Contrato não realizado", funcionario.contratar());
    }

    @Test
    public void deveDarFeriasFuncionaio() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertEquals("Ferias realizada", funcionario.ferias());
    }

    @Test
    public void naoDeveDarLicencaFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertEquals("Licenca não realizada", funcionario.licenca());
    }

    @Test
    public void naoDeveDemitirFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertEquals("Demissao não realizada", funcionario.demitir());
    }


    // Funcionario jubilado

    @Test
    public void naoDeveContratarFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertEquals("Contratacao não realizada", funcionario.contratar());
    }

    @Test
    public void naoDeveDarFeriasFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertEquals("Ferias não realizada", funcionario.ferias());
    }

    @Test
    public void naoDeveDarLicencaFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertEquals("Licenca não realizada", funcionario.licenca());
    }

    @Test
    public void deveDemitirFuncionario() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertEquals("Demissao realizada", funcionario.demitir());
    }


}