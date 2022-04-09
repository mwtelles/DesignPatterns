package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepublicaTest {

    @Test
    void deveRetornarPessoas() {
        Republica republica = new Republica();
        republica.Aceitar("Matheus", "RJ", "Sul Fluminense");
        republica.Aceitar("Marcos", "RJ", "Sul Fluminense");
        republica.Aceitar("Isabela", "SP", "Baixada Santista");
        republica.Aceitar("Fernanda", "SP", "Baixada");

        List<String> saida = Arrays.asList(
                "Membro {nome='Matheus', UF='RJ', Regiao='Sul Fluminense'}",
                "Membro {nome='Marcos', UF='RJ', Regiao='Sul Fluminense'}",
                "Membro {nome='Isabela', UF='SP', Regiao='Baixada Santista'}",
                "Membro {nome='Fernanda', UF='SP', Regiao='Baixada Santista'}");

        assertEquals(saida, republica.obterPessoa());
    }

    @Test
    void deveRetornarTotalUF() {
        Republica republica = new Republica();
        republica.Aceitar("Ricardo", "MG", "Capital");
        republica.Aceitar("Joao", "MG", "Capital");
        republica.Aceitar("Maria", "AM", "Capital");
        republica.Aceitar("Clara", "SC", "Capital");

        assertEquals(3, UFFactory.getTotalUF());
    }

}