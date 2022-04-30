public class FuncionarioEstadoLicenca implements FuncionarioEstado {

    private FuncionarioEstadoLicenca() {};
    private static FuncionarioEstadoLicenca instance = new FuncionarioEstadoLicenca();
    public static FuncionarioEstadoLicenca getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Licenca";
    }

}

