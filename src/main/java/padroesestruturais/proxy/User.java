package padroesestruturais.proxy;

public class User {
    private String nome;
    private boolean friend;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean inFriendList() {
        return friend;
    }

    public void setInFriendList(boolean amigo) {
        this.friend = amigo;
    }

    public User(String nome, boolean friend) {
        this.nome = nome;
        this.friend = friend;
    }
}