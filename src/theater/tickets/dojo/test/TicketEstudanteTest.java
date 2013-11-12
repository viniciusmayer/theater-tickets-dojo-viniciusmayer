package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

public class TicketEstudanteTest {

	@Test
	public void testPrecoDoTicketParaEstudanteNoDomingoDeveSerIgualA8Reais() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(8.0));
	}

	@Test
	public void testPrecoDoTicketParaEstudanteNaSegundaDeveSerIgualA5ReaisE20Centavos() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(5.2));
	}

	@Test
	public void testPrecoDoTicketParaEstudanteNaTercaDeveSerIgualA5ReaisE20Centavos() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.TERCA);
		Assert.assertTrue(ticket.getPreco().equals(5.2));
	}

	@Test
	public void testPrecoDoTicketParaEstudanteNaQuartaDeveSerIgualA5ReaisE20Centavos() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.QUARTA);
		Assert.assertTrue(ticket.getPreco().equals(5.2));
	}

	@Test
	public void testPrecoDoTicketParaEstudanteNaQuintaDeveSerIgualA5ReaisE20Centavos() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.QUINTA);
		Assert.assertTrue(ticket.getPreco().equals(5.2));
	}

	@Test
	public void testPrecoDoTicketParaEstudanteNaSextaDeveSerIgualA5ReaisE20Centavos() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.SEXTA);
		Assert.assertTrue(ticket.getPreco().equals(5.2));
	}

	@Test
	public void testPrecoDoTicketParaEstudanteNoSabadoDeveSerIgualA8Reais() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.SABADO);
		Assert.assertTrue(ticket.getPreco().equals(8.0));
	}

	@Test
	public void testPrecoDoTicketParaEstudanteEmFeriadosDeveSerIgualA8Reais() {
		Ticket ticket = Tipo.ESTUDANTE.getTicket(DiaDaSemana.FERIADO);
		Assert.assertTrue(ticket.getPreco().equals(8.0));
	}
}