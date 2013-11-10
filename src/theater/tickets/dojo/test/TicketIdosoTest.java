package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketIdosoTest {

	@Test
	public void testDomingo(){
		Ticket ticket = new Ticket(Tipo.IDOSO, DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(5.7));
	}
	
	@Test
	public void testSegunda() {
		Ticket ticket = new Ticket(Tipo.IDOSO, DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(5.4));
	}
	
	@Test
	public void testTerca() {
		Ticket ticket = new Ticket(Tipo.IDOSO, DiaDaSemana.TERCA);
		Assert.assertTrue(ticket.getPreco().equals(5.1));
	}
}