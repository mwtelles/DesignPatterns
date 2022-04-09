package padroesestruturais.adapter;

public class Termometro {

    ITemperatura medida;
    TemperaturaAdapter persistencia;

    public Termometro() {
        medida = new TemperaturaFahrenheit();
        persistencia = new TemperaturaAdapter(medida);
    }

    public void setMedida(float valor) {
        medida.setTemperatura(valor);
        persistencia.salvarMedida();
    }

    public float getMedida() {
        return persistencia.recuperaMedida();
    }

    public float getMedidaCelsius() {
        return persistencia.getCelsius();
    }
}
