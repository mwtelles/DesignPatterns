public class Infraestrutura implements Setor {

    private static Infraestrutura instancia = new Infraestrutura();

    private Infraestrutura() {}

    public static Infraestrutura getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Infraestrutura vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Infraestrutura agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Infraestrutura vai analisar a sugestão: " + mensagem;
    }
}
