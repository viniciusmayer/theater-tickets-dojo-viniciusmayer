package theater.tickets.dojo;

public class TicketIdoso extends Ticket {

	public TicketIdoso(Double preco, DiaDaSemana diaDaSemana) {
		super(preco, diaDaSemana);
	}

	@Override
	public Double getPercentualDesconto() {
		return this.getDiaDaSemana().getPercentualDescontoIdoso();
	}
}