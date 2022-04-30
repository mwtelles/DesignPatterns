public class DevJunior extends Dev {

    public String verificarPromocao() {
        if (this.calcularPromocao() >= 6.0f) {
            return "Promovido";
        }
        else {
            return "Nao Promovido";
        }
    }

}
