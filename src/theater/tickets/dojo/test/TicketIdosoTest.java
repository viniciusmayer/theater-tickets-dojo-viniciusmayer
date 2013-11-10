package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketIdosoTest {

	@Test
	public void testDomingo(){
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(5.7));
	}
	
	@Test
	public void testSegunda() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(5.4));
	}
	
	@Test
	public void testTerca() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.TERCA);
		Assert.assertTrue(ticket.getPreco().equals(5.1));
	}
	
	@Test
	public void testQuarta() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.QUARTA);
		Assert.assertTrue(ticket.getPreco().equals(3.6));
	}
	
	@Test
	public void testQuinta() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.QUINTA);
		Assert.assertTrue(ticket.getPreco().equals(4.2));
	}
	
	@Test
	public void testSexta() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.SEXTA);
		Assert.assertTrue(ticket.getPreco().equals(6.0));
	}
	
	@Test
	public void testSabado() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.SABADO);
		Assert.assertTrue(ticket.getPreco().equals(5.7));
	}
}