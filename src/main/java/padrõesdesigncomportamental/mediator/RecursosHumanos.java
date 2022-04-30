public class RecursosHumanos {

    private static RecursosHumanos instancia = new RecursosHumanos();

    private RecursosHumanos() {}

    public static RecursosHumanos getInstancia() {
        return instancia;
    }

    public String receberElogioInfraestrutura(String mensagem) {
        return "O Recursos Humanos agradece seu contato.\n"+
                "A Infraestrutura respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Infraestrutura.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoInfraestrutura(String mensagem) {
        return "O Recursos Humanos agradece seu contato.\n"+
                "A Infraestrutura respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Infraestrutura.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoInfraestrutura(String mensagem) {
        return "O Recursos Humanos agradece seu contato.\n"+
                "A Infraestrutura respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Infraestrutura.getInstancia().receberSugestao(mensagem);
    }

}
