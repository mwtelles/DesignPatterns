public class RecursosHumanos implements Pessoa {

    private int cpf;
    private String nome;
    private Setor setor;

    public RecursosHumanos(int cpf, String nome, Setor setor) {
        this.cpf = cpf;
        this.nome = nome;
        this.setor = setor;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeSetor() {
        return this.setor.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirRecursosHumanos(this);
    }

}
