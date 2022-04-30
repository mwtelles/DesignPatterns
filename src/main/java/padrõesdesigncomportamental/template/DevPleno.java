public class DevPleno extends Dev {

    public String verificarPromocao() {
        if (this.calcularPromocao() >= 7.0f) {
            return "Promovido";
        }
        else {
            return "Nao Promovido";
        }
    }

    @Override
    public String getTipo() {
        return "DevPleno";
    }
}
