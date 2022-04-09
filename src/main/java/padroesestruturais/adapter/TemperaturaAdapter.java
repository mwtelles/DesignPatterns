package padroesestruturais.adapter;

public class TemperaturaAdapter extends TemperaturaCelsius {

    private ITemperatura medidaFahrenheit;

    public TemperaturaAdapter(ITemperatura medidaFahrenheit) {
        this.medidaFahrenheit = medidaFahrenheit;
    }

    public float recuperaMedida() {
        medidaFahrenheit.setTemperatura(this.getCelsius() * 1.8f + 32);
        return medidaFahrenheit.getTemperatura();

    }

    public void salvarMedida() {
        this.setCelsius(medidaFahrenheit.getTemperatura());
    }
}
