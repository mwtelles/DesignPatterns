package padroesestruturais.facade;

public class Finances extends Department {

    private static Finances finances = new Finances();

    private Finances() {};

    public static Finances getInstancia() {
        return finances;
    }
}