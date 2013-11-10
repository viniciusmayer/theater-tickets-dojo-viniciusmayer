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
		Double preco = this.tipo.getPreco();
		if (this.tipo.equals(Tipo.CRIANCA)){
			if (this.diaDaSemana.equals(DiaDaSemana.DOMINGO)){
				return preco;
			} else if (this.diaDaSemana.equals(DiaDaSemana.SEGUNDA)){
				return preco - (preco * 0.1);
			}
		} else if (this.tipo.equals(Tipo.ESTUDANTE)){
			if (this.diaDaSemana.equals(DiaDaSemana.DOMINGO)){
				return preco;
			} else if (this.diaDaSemana.equals(DiaDaSemana.SEGUNDA)){
				return preco - (preco * 0.1);
			}
		} else if (this.tipo.equals(Tipo.IDOSO)){
			if (this.diaDaSemana.equals(DiaDaSemana.DOMINGO)){
				return preco - (preco * 0.05);
			} else if (this.diaDaSemana.equals(DiaDaSemana.SEGUNDA)){
				return preco - (preco * 0.1);
			}
		}
		return null;
	}

}