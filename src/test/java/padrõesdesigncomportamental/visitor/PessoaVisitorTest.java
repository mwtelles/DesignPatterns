import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirRecursosHumanos() {
        RecursosHumanos rh = new RecursosHumanos(113747, "Ana", new Setor("Sistemas de Informação"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("RecursosHumanos{cpf=113747, nome='Ana', curso=Sistemas de Informação}", visitor.exibir(rh));
    }

    @Test
    void deveExibirCeo() {
        Ceo ceo = new Ceo("Maria", "Dona");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Ceo{nome='Maria', titulacao='Dona'}", visitor.exibir(ceo));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }

}