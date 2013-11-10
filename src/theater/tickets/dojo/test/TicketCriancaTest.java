package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketCriancaTest {

	@Test
	public void testDomingo() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}

	@Test
	public void testSegunda() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(4.95));
	}

	@Test
	public void testTerca() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.TERCA);
		Assert.assertTrue(ticket.getPreco().equals(4.68));
	}
}