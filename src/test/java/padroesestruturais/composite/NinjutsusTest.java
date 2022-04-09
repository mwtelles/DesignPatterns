package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjutsusTest {

    @Test
    void deveRetornarNinjutsus() {
        Ninjutsus ninjutsus1 = new Ninjutsus("Suiton");

        Ninjutsus ninjutsus2 = new Ninjutsus("Katon");
        Jutsus jutsus1 = new Jutsus("Amaterasu");
        Jutsus jutsus2 = new Jutsus("Gokakyu no Jutsu");
        ninjutsus2.addCompetencia(jutsus1);
        ninjutsus2.addCompetencia(jutsus2);

        Ninjutsus ninjutsus3 = new Ninjutsus("Doton");
        Jutsus jutsus3 = new Jutsus("Doryuheki");
        ninjutsus3.addCompetencia(jutsus3);

        Ninjutsus habilidades = new Ninjutsus("Futon");
        habilidades.addCompetencia(ninjutsus1);
        habilidades.addCompetencia(ninjutsus2);
        habilidades.addCompetencia(ninjutsus3);

        Personagem personagem = new Personagem();
        personagem.setHabilidade(habilidades);

        assertEquals("Ninjutsu: Futon\n" +
                "Ninjutsu: Suiton\n" +
                "Ninjutsu: Katon\n" +
                "Habilidade: Amaterasu\n" +
                "Habilidade: Gokakyu no Jutsu\n" +
                "Ninjutsu: Doton\n" +
                "Habilidade: Doryuheki\n", personagem.getHabilidade());
    }

    @Test
    void deveRetornarPersonagemSemChakra() {
        try {
            Personagem personagem = new Personagem();
            personagem.getHabilidade();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Personagem sem Chakra", e.getMessage());
        }
    }
}
