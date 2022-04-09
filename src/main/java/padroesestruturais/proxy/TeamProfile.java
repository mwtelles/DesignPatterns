package padroesestruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class TeamProfile implements ITeamProfile {
    private String nome;
    private String statusTime;
    private String descricao;
    private Integer numeroJogadores;
    private Integer titulos;

    public TeamProfile(Integer numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
        TeamProfile perfil = DataBase.getPerfil(numeroJogadores);
        this.nome = perfil.nome;
        this.statusTime = perfil.statusTime;
        this.descricao = perfil.descricao;
        this.titulos = perfil.titulos;
    }

    public TeamProfile(String nome, String statusTime, String descricao, Integer numeroJogadores, int titulos) {
        this.nome = nome;
        this.statusTime = statusTime;
        this.descricao = descricao;
        this.numeroJogadores = numeroJogadores;
        this.titulos = titulos;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(Integer numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    @Override
    public List<String> obterDados() {
        return Arrays.asList(this.nome, this.descricao, this.statusTime);
    }

    @Override
    public List<Integer> obterTitulos(User user) {
        return Arrays.asList(this.titulos);
    }
}
