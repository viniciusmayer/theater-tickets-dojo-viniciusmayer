package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketTest {

	@Test
	public void testCriancaDomingo() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}

}
