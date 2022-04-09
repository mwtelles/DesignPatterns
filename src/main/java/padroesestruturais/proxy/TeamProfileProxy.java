package padroesestruturais.proxy;

import java.util.List;

public class TeamProfileProxy implements ITeamProfile {
    private TeamProfile perfil;
    private Integer numeroJogadores;

    public TeamProfileProxy(Integer numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    @Override
    public List<String> obterDados() {
        if (this.perfil == null) {
            this.perfil = new TeamProfile(this.numeroJogadores);
        }
        return this.perfil.obterDados();
    }

    @Override
    public List<Integer> obterTitulos(User user) {
        if(!user.inFriendList()){
            throw new IllegalArgumentException("Perfil Privado");
        }
        if (this.perfil == null) {
            this.perfil = new TeamProfile(this.numeroJogadores);
        }
        return this.perfil.obterTitulos(user);
    }
}