package padroesestruturais.facade;

public class Tech extends Department {

    private static Tech tech = new Tech();

    private Tech() {};

    public static Tech getInstancia() {
        return tech;
    }
}
