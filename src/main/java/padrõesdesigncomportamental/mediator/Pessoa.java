public class Pessoa {

    public String elogiarInfraestrutura(String mensagem) {
        return RecursosHumanos.getInstancia().receberElogioInfraestrutura(mensagem);
    }

    public String reclamarInfraestrutura(String mensagem) {
        return RecursosHumanos.getInstancia().receberReclamacaoInfraestrutura(mensagem);
    }

    public String sugerirInfraestrutura(String mensagem) {
        return RecursosHumanos.getInstancia().receberSugestaoInfraestrutura(mensagem);
    }


}
