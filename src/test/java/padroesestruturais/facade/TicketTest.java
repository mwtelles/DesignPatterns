package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {
    @Test
    void deveRedirecionarTicketTech() {
        Ticket ticket = new Ticket();
        Finances.getInstancia().addCall(ticket);

        assertEquals(true, ticket.redirecionar());
    }

    @Test
    void deveRedirecionarTicketFinances() {
        Ticket ticket = new Ticket();
        Tech.getInstancia().addCall(ticket);

        assertEquals(true, ticket.redirecionar());
    }

    @Test
    void deveRedirecionarTicketAttendance() {
        Ticket ticket = new Ticket();
        Attendance.getInstancia().addCall(ticket);

        assertEquals(true, ticket.redirecionar());
    }

    @Test
    void deveRetornarSemSetor() {
        Ticket ticket = new Ticket();

        assertEquals(false, ticket.redirecionar());
    }
}
