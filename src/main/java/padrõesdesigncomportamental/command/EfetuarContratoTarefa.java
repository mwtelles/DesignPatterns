public class EfetuarContratoTarefa implements Tarefa {

    private Contrato contrato;

    public EfetuarContratoTarefa(Contrato contrato) {
        this.contrato = contrato;
    }

    public void executar() {
        this.contrato.efetuarContrato();
    }

    public void cancelar() {
        this.contrato.finalizarContrato();
    }
}
