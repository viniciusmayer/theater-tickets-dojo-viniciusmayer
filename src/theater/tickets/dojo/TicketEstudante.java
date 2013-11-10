package theater.tickets.dojo;


public class TicketEstudante extends Ticket {

	public TicketEstudante(Double preco, DiaDaSemana diaDaSemana) {
		super(preco, diaDaSemana);
	}

	@Override
	public Double getPercentualDesconto() {
		return this.getDiaDaSemana().getPercentualDescontoEstudante();
	}

}
