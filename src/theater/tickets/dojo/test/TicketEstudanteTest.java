package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketEstudanteTest {

	@Test
	public void testDomingo(){
		Ticket ticket = new Ticket(Tipo.ESTUDANTE, DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(8.0));
	}
	
	@Test
	public void testSegunda() {
		Ticket ticket = new Ticket(Tipo.ESTUDANTE, DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(7.2));
	}
}