package theater.tickets.dojo;

import java.text.DecimalFormat;

public abstract class Ticket {

	private static final String DECIMAL_FORMAT = "###.##";
	
	private Double precoOriginal;
	private DiaDaSemana diaDaSemana;

	public Ticket(Double precoOriginal, DiaDaSemana diaDaSemana) {
		this.precoOriginal = precoOriginal;
		this.diaDaSemana = diaDaSemana;
	}

	protected Double getPrecoOriginal() {
		return precoOriginal;
	}

	public DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}

	public Double getPreco() {
		Double preco = this.precoOriginal;
		Double percentualDesconto = this.getPercentualDesconto();
		preco -= (preco * percentualDesconto);
		return roundDecimal(preco);
	}

	private Double roundDecimal(Double preco) {
		DecimalFormat decimalFormat = new DecimalFormat(DECIMAL_FORMAT);
		String precoAsString = decimalFormat.format(preco);
		return new Double(precoAsString);
	}

	public abstract Double getPercentualDesconto();

}