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

	@Test
	public void testQuarta() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.QUARTA);
		Assert.assertTrue(ticket.getPreco().equals(3.85));
	}

	@Test
	public void testQuinta() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.QUINTA);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}

	@Test
	public void testSexta() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.SEXTA);
		Assert.assertTrue(ticket.getPreco().equals(4.9));
	}

	@Test
	public void testSabado() {
		Ticket ticket = new Ticket(Tipo.CRIANCA, DiaDaSemana.SABADO);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}
}