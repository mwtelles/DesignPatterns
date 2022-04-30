public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirRecursosHumanos(RecursosHumanos rh) {
        return "RecursosHumanos{" +
                "cpf=" + rh.getCpf() +
                ", nome='" + rh.getNome() + '\'' +
                ", curso=" + rh.getNomeSetor() +
                '}';
    }

    @Override
    public String exibirCeo(Ceo ceo) {
        return "Ceo{" +
                "nome='" + ceo.getNome() + '\'' +
                ", titulacao='" + ceo.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
