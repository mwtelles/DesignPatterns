public interface FuncionarioEstado {

    String getEstado();

    String contratar(Funcionario funcionario);

    String demitir(Funcionario funcionario);

    String ferias(Funcionario funcionario);

    String licenca(Funcionario funcionario);

}