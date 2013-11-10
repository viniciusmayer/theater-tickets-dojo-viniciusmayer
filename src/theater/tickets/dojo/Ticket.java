package theater.tickets.dojo;

public class Ticket {

	private Tipo tipo;
	private DiaDaSemana diaDaSemana;

	public Tipo getTipo() {
		return tipo;
	}

	public DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}

	public Ticket(Tipo tipo, DiaDaSemana diaDaSemana) {
		this.tipo = tipo;
		this.diaDaSemana = diaDaSemana;
	}

	public Double getPreco() {
		if (this.tipo.equals(Tipo.CRIANCA)){
			if (this.diaDaSemana.equals(DiaDaSemana.DOMINGO)){
				return 5.5;
			} else if (this.diaDaSemana.equals(DiaDaSemana.SEGUNDA)){
				return 5.5 - (5.5 * 0.1);
			}
		} else if (this.tipo.equals(Tipo.ESTUDANTE)){
			if (this.diaDaSemana.equals(DiaDaSemana.DOMINGO)){
				return 8.0;
			}
		} else if (this.tipo.equals(Tipo.IDOSO)){
			if (this.diaDaSemana.equals(DiaDaSemana.DOMINGO)){
				return 6.0 - (6.0 * 0.05);
			}
		}
		return null;
	}

}