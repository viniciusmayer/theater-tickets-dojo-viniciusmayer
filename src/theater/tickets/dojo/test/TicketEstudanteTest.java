package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketEstudanteTest {

	@Test
	public void testDomingo(){
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(8.0));
	}
	
	@Test
	public void testSegunda() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(7.2));
	}

	@Test
	public void testTerca() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.TERCA);
		Assert.assertTrue(ticket.getPreco().equals(7.6));
	}

	@Test
	public void testQuarta() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.QUARTA);
		Assert.assertTrue(ticket.getPreco().equals(4.0));
	}

	@Test
	public void testQuinta() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.QUINTA);
		Assert.assertTrue(ticket.getPreco().equals(5.6));
	}

	@Test
	public void testSexta() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.SEXTA);
		Assert.assertTrue(ticket.getPreco().equals(8.0));
	}

	@Test
	public void testSabado() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.SABADO);
		Assert.assertTrue(ticket.getPreco().equals(8.0));
	}
}