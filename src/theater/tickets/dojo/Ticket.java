package theater.tickets.dojo;

import java.text.DecimalFormat;

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
			if (this.diaDaSemana.equals(DiaDaSemana.SEGUNDA)){
				preco -=  (preco * 0.1);
			} else if (this.diaDaSemana.equals(DiaDaSemana.TERCA)){
				preco -= (preco * 0.15);
			}
		} else if (this.tipo.equals(Tipo.ESTUDANTE)){
			if (this.diaDaSemana.equals(DiaDaSemana.SEGUNDA)){
				preco -= (preco * 0.1);
			} else if (this.diaDaSemana.equals(DiaDaSemana.TERCA)){
				preco -= (preco * 0.05);
			}
		} else if (this.tipo.equals(Tipo.IDOSO)){
			if (this.diaDaSemana.equals(DiaDaSemana.DOMINGO)){
				preco -= (preco * 0.05);
			} else if (this.diaDaSemana.equals(DiaDaSemana.SEGUNDA)){
				preco -= (preco * 0.1);
			}
		}
		DecimalFormat decimalFormat = new DecimalFormat("###.##");
		String precoAsString = decimalFormat.format(preco);
		return new Double(precoAsString);
	}

}