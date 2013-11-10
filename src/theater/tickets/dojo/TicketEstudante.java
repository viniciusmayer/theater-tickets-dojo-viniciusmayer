package theater.tickets.dojo;

import java.text.DecimalFormat;

public class TicketEstudante extends Ticket {

	public TicketEstudante(Double preco, DiaDaSemana diaDaSemana) {
		super(preco, diaDaSemana);
	}

	@Override
	public Double getPreco() {
		Double preco = this.getPrecoOriginal();
		Double percentualDesconto = 0.0;
		percentualDesconto = this.getDiaDaSemana().getPercentualDescontoEstudante();
		preco -=  (preco * percentualDesconto);
		DecimalFormat decimalFormat = new DecimalFormat("###.##");
		String precoAsString = decimalFormat.format(preco);
		return new Double(precoAsString);
	}

}
