package theater.tickets.dojo;

public class TicketPadrao extends Ticket {

	public TicketPadrao(Double preco, DiaDaSemana diaDaSemana) {
		super(preco, diaDaSemana);
	}

	@Override
	public Double getPercentualDesconto() {
		return this.getDiaDaSemana().getPercentualDescontoPadrao();
	}

}
