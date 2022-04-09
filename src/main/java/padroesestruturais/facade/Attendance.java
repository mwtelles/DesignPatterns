package padroesestruturais.facade;

public class Attendance extends Department {

    private static Attendance attendance = new Attendance();

    private Attendance() {};

    public static Attendance getInstancia() {
        return attendance;
    }
}
