package theater.tickets.dojo;

public class TicketCrianca extends Ticket {

	public TicketCrianca(Double preco, DiaDaSemana diaDaSemana) {
		super(preco, diaDaSemana);
	}

	@Override
	public Double getPercentualDesconto() {
		return this.getDiaDaSemana().getPercentualDescontoCrianca();
	}

}
