package padroescriacao.builder;

import java.util.Date;

public class JogadorBuilder {

    private Jogador jogador;

    public JogadorBuilder() {
        jogador = new Jogador();
    }

    public Jogador build() {

       if (jogador.getUsuario().equals("")) {
           throw new IllegalArgumentException("Usuario invalido");
       }
       if (jogador.getEmail().equals("")){
           throw new IllegalArgumentException("Email invalido");
       }

       return jogador;
    }

    public JogadorBuilder setUsuario(String usuario) {
        jogador.setUsuario(usuario);
        return this;
    }

    public JogadorBuilder setDataNascimento(Date dataNascimento) {
        jogador.setDataNascimento(dataNascimento);
        return this;
    }

    public JogadorBuilder setGenero(String genero) {
        jogador.setGenero(genero);
        return this;
    }

    public JogadorBuilder setEmail(String email) {
        jogador.setEmail(email);
        return this;
    }
}
