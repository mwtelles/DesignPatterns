package padroesestruturais.adapter;

public class TemperaturaFahrenheit implements ITemperatura {

    private float fahrenheit;

    @Override
    public float getTemperatura() {
        return this.fahrenheit;
    }

    @Override
    public  void setTemperatura(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

}
