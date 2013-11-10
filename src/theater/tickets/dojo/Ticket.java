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
		Double percentualDesconto = 0.0;
		
		switch (this.tipo) {
		case CRIANCA:
			percentualDesconto = this.diaDaSemana.getPercentualDescontoCrianca();
			break;
		case ESTUDANTE:
			percentualDesconto = this.diaDaSemana.getPercentualDescontoEstudante();
			break;
		default:
			percentualDesconto = this.diaDaSemana.getPercentualDescontoIdoso();
			break;
		}
		
		preco -=  (preco * percentualDesconto);
		DecimalFormat decimalFormat = new DecimalFormat("###.##");
		String precoAsString = decimalFormat.format(preco);
		return new Double(precoAsString);
	}

}