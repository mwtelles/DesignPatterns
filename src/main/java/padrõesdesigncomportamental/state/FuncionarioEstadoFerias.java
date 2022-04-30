public class FuncionarioEstadoFerias implements FuncionarioEstado {

    private FuncionarioEstadoFerias() {};
    private static FuncionarioEstadoFerias instance = new FuncionarioEstadoFerias();
    public static FuncionarioEstadoFerias getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ferias";
    }

    public String contratar(Funcionario funcionario) {
        return "Contrato não realizado";
    }

    public String ferias(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        return "Ferias realizada";
    }

    public String demitir(Funcionario funcionario) {
        return "Demissao não realizada";
    }

    public String licenca(Funcionario funcionario) {
        return "Licenca não realizada";
    }


}
