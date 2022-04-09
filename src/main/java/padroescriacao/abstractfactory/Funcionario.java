package padroescriacao.abstractfactory;

public class Funcionario {

    private Contrato contrato;
    private Funcoes funcoes;

    public Funcionario(FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.funcoes = fabrica.createFuncoes();
    }

    public String imprimirContrato() { return this.contrato.retornar(); }

    public String imprimiBeneficios() { return this.funcoes.retornar(); }

}
