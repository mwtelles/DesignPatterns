package padroescriacao.singleton;

public class Maquinas {

    private Maquinas() {};
    private static Maquinas instance = new Maquinas();
    static Maquinas getInstance() { return instance; }

    private String ipMaquina;
    private String senhaMaquina;


    public String getIp() {
        return ipMaquina;
    }

    public void setIp(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    public String getSenha() {
        return senhaMaquina;
    }

    public void setSenha(String senhaMaquina) {
        this.senhaMaquina = senhaMaquina;
    }
}
