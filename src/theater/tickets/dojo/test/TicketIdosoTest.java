package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketIdosoTest {

	@Test
	public void testPrecoDoTicketParaIdosoNoDomingoDeveSerIgualA5ReaisE70Centavos() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(5.7));
	}

	@Test
	public void testPrecoDoTicketParaIdosoNaSegundaDeveSerIgualA5ReaisE40Centavos() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(5.4));
	}

	@Test
	public void testPrecoDoTicketParaIdosoNaTercaDeveSerIgualA5ReaisE10Centavos() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.TERCA);
		Assert.assertTrue(ticket.getPreco().equals(5.1));
	}

	@Test
	public void testPrecoDoTicketParaIdosoNaQuartaDeveSerIgualA3ReaisE60Centavos() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.QUARTA);
		Assert.assertTrue(ticket.getPreco().equals(3.6));
	}

	@Test
	public void testPrecoDoTicketParaIdosoNaQuintaDeveSerIgualA4ReaisE20Centavos() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.QUINTA);
		Assert.assertTrue(ticket.getPreco().equals(4.2));
	}

	@Test
	public void testPrecoDoTicketParaIdosoNaSextaDeveSerIgualA6Reais() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.SEXTA);
		Assert.assertTrue(ticket.getPreco().equals(6.0));
	}

	@Test
	public void testPrecoDoTicketParaIdosoNoSabadoDeveSerIgualA5ReaisE70Centavos() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.SABADO);
		Assert.assertTrue(ticket.getPreco().equals(5.7));
	}

	@Test
	public void testPrecoDoTicketParaIdosoEmFeriadosDeveSerIgualA5ReaisE70Centavos() {
		Ticket ticket = Tipo.IDOSO.getTicket(DiaDaSemana.FERIADO);
		Assert.assertTrue(ticket.getPreco().equals(5.7));
	}
}