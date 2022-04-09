package padroesestruturais.facade;

public class Ticket {

    public boolean redirecionar() {
        return TicketFacade.verificarRedirecionamento(this);
    }

}
