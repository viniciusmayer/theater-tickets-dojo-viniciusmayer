package theater.tickets.dojo;


public abstract class Ticket {

	private Double precoOriginal;
	private DiaDaSemana diaDaSemana;

	public DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}

	public Ticket(Double precoOriginal, DiaDaSemana diaDaSemana) {
		this.precoOriginal = precoOriginal;
		this.diaDaSemana = diaDaSemana;
	}
	
	protected Double getPrecoOriginal() {
		return precoOriginal;
	}

	public abstract Double getPreco();
	
}