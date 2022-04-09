package padroesestruturais.composite;

public abstract class Selos {

    private String elementos;

    public Selos(String elementos) {
        this.elementos = elementos;
    }

    public String getElementos() {
        return elementos;
    }

    public void setElementos(String elementos) {
        this.elementos = elementos;
    }

    public abstract String getSelos();
}
