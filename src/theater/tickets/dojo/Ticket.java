package theater.tickets.dojo;

import java.text.DecimalFormat;

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

	public Double getPreco() {
		Double preco = this.precoOriginal;
		Double percentualDesconto = this.getPercentualDesconto();
		preco -= (preco * percentualDesconto);
		DecimalFormat decimalFormat = new DecimalFormat("###.##");
		String precoAsString = decimalFormat.format(preco);
		return new Double(precoAsString);
	}

	public abstract Double getPercentualDesconto();

}