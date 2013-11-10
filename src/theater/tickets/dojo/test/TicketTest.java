package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketTest {

	/*
	 * DOMINGO
	 */
	@Test
	public void testCriancaDomingo() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}

	@Test
	public void testEstudanteDomingo(){
		Ticket ticket = new Ticket(Tipo.ESTUDANTE, DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(8.0));
	}
	
	@Test
	public void testIdosoDomingo(){
		Ticket ticket = new Ticket(Tipo.IDOSO, DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(5.7));
	}
	
	
	/*
	 * SEGUNDA
	 */
	@Test
	public void testCriancaSegunda() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(4.95));
	}

	@Test
	public void testEstudanteSegunda() {
		Ticket ticket = new Ticket(Tipo.ESTUDANTE, DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(7.2));
	}
	
	@Test
	public void testIdosoSegunda() {
		Ticket ticket = new Ticket(Tipo.IDOSO, DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(5.4));
	}
}