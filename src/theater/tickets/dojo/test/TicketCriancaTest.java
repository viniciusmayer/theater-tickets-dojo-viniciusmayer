package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketCriancaTest {

	@Test
	public void testPrecoDoTicketParaCriancaNoDomingoDeveSerIgualA5ReaisE50Centavos() {
		Ticket ticket = Tipo.CRIANCA.getTicket(DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}

	@Test
	public void testPrecoDoTicketParaCriancaNaSegundaDeveSerIgualA4ReaisE95Centavos() {
		Ticket ticket = Tipo.CRIANCA.getTicket(DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(4.95));
	}

	@Test
	public void testPrecoDoTicketParaCriancaNaTercaDeveSerIgualA4ReaisE68Centavos() {
		Ticket ticket = Tipo.CRIANCA.getTicket(DiaDaSemana.TERCA);
		Assert.assertTrue(ticket.getPreco().equals(4.68));
	}

	@Test
	public void testPrecoDoTicketParaCriancaNaQuartaDeveSerIgualA3ReaisE85Centavos() {
		Ticket ticket = Tipo.CRIANCA.getTicket(DiaDaSemana.QUARTA);
		Assert.assertTrue(ticket.getPreco().equals(3.85));
	}

	@Test
	public void testPrecoDoTicketParaCriancaNaQuintaDeveSerIgualA5ReaisE50Centavos() {
		Ticket ticket = Tipo.CRIANCA.getTicket(DiaDaSemana.QUINTA);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}

	@Test
	public void testPrecoDoTicketParaCriancaNaSextaDeveSerIgualA4ReaisE90Centavos() {
		Ticket ticket = Tipo.CRIANCA.getTicket(DiaDaSemana.SEXTA);
		Assert.assertTrue(ticket.getPreco().equals(4.9));
	}

	@Test
	public void testPrecoDoTicketParaCriancaNoSabadoDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.CRIANCA.getTicket(DiaDaSemana.SABADO);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}

	@Test
	public void testPrecoDoTicketParaCriancaEmFeriadosDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.CRIANCA.getTicket(DiaDaSemana.FERIADO);
		Assert.assertTrue(ticket.getPreco().equals(5.5));
	}
}