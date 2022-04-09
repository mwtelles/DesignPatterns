package padroescriacao.factory;

public class VistoFactory {

    public static Visto obterVisto(String visto) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factory.Visto" + visto);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Visto inexistente");
        }
        if (!(objeto instanceof Visto)) {
            throw new IllegalArgumentException("Visto inválido");
        }
        return (Visto) objeto;
    }

}