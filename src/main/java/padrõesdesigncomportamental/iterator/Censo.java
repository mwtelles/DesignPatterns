import java.util.Iterator;

public class Censo {

    public static Integer contarFuncionariosAtivosSetor(Setor setor) {
        int quantidade = 0;
        for (Funcionario funcionario : setor) {
            if (funcionario.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFuncionariosSetor(Setor setor) {
        int quantidade = 0;
        for (Iterator a = setor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
