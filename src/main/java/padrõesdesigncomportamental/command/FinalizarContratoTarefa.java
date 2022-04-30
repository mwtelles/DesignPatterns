public class FinalizarContratoTarefa implements Tarefa {

    private Contrato contrato;

    public FinalizarContratoTarefa(Contrato contrato) {
        this.contrato = contrato;
    }

    public void executar() {
        this.contrato.finalizarContrato();
    }

    public void cancelar() {
        this.contrato.efetuarContrato();
    }
}
