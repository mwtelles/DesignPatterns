package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Department {

    private List<Ticket> ticket = new ArrayList<Ticket>();

    public void addCall(Ticket ticket) {
        this.ticket.add(ticket);
    }

    public boolean verifyCall(Ticket ticket) {
        return this.ticket.contains(ticket);
    }

}
