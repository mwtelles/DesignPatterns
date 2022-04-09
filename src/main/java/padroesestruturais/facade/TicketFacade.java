package padroesestruturais.facade;

public class TicketFacade {

    public static boolean verificarRedirecionamento(Ticket ticket) {
        if (Attendance.getInstancia().verifyCall(ticket)) {
            return true;
        }
        if (Finances.getInstancia().verifyCall(ticket)) {
            return true;
        }
        if (Tech.getInstancia().verifyCall(ticket)) {
            return true;
        }
        return false;
    }

}
