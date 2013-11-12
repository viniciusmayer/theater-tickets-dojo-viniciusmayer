package theater.tickets.dojo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import theater.tickets.dojo.DiaDaSemana;
import theater.tickets.dojo.Ticket;
import theater.tickets.dojo.Tipo;

@RunWith(Suite.class)
@SuiteClasses({ TicketCriancaTest.class, TicketEstudanteTest.class, TicketIdosoTest.class })
public class AllTicketTests {

	@Test
	public void testPrecoDoTicketPadraoNoDomingoDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.PADRAO.getTicket(DiaDaSemana.DOMINGO);
		Assert.assertTrue(ticket.getPreco().equals(10.0));
	}

	@Test
	public void testPrecoDoTicketPadraoNaSegundaDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.PADRAO.getTicket(DiaDaSemana.SEGUNDA);
		Assert.assertTrue(ticket.getPreco().equals(10.0));
	}

	@Test
	public void testPrecoDoTicketPadraoNaTercaDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.PADRAO.getTicket(DiaDaSemana.TERCA);
		Assert.assertTrue(ticket.getPreco().equals(10.0));
	}

	@Test
	public void testPrecoDoTicketPadraoNaQuartaDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.PADRAO.getTicket(DiaDaSemana.QUARTA);
		Assert.assertTrue(ticket.getPreco().equals(10.0));
	}

	@Test
	public void testPrecoDoTicketPadraoNaQuintaDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.PADRAO.getTicket(DiaDaSemana.QUINTA);
		Assert.assertTrue(ticket.getPreco().equals(10.0));
	}

	@Test
	public void testPrecoDoTicketPadraoNaSextaDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.PADRAO.getTicket(DiaDaSemana.SEXTA);
		Assert.assertTrue(ticket.getPreco().equals(10.0));
	}

	@Test
	public void testPrecoDoTicketPadraoNoSabadoDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.PADRAO.getTicket(DiaDaSemana.SABADO);
		Assert.assertTrue(ticket.getPreco().equals(10.0));
	}

	@Test
	public void testPrecoDoTicketPadraoEmFeriadosDeveSerIgualA10Reais() {
		Ticket ticket = Tipo.PADRAO.getTicket(DiaDaSemana.FERIADO);
		Assert.assertTrue(ticket.getPreco().equals(10.0));
	}
}