package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtistaMarcialTest {

    @Test
    void deveRetornarDanoOrcArtistaMarcial() {
        Raca raca = new Orc();
        ArtistaMarcial artistaMarcial = new ArtistaMarcial(100);
        artistaMarcial.setRaca(raca);
        assertEquals(120.00001f, artistaMarcial.calcularDano());
    }

    @Test
    void deveRetornarDanoHumanoArtistaMarcial() {
        Raca raca = new Humano();
        ArtistaMarcial artistaMarcial = new ArtistaMarcial(100);
        artistaMarcial.setRaca(raca);
        assertEquals(110.0f, artistaMarcial.calcularDano());
    }

}