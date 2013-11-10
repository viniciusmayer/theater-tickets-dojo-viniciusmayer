package theater.tickets.dojo;

public enum DiaDaSemana {

	DOMINGO(0.0, 0.0, 0.05),
	SEGUNDA(0.1, 0.35, 0.1),
	TERCA(0.15, 0.35, 0.15),
	QUARTA(0.3, 0.35, 0.4),
	QUINTA(0.0, 0.35, 0.3),
	SEXTA(0.11, 0.35, 0.0),
	SABADO(0.0, 0.0, 0.05);

	private Double percentualDescontoCrianca;
	private Double percentualDescontoEstudante;
	private Double percentualDescontoIdoso;

	private DiaDaSemana(Double percentualDescontoCrianca, Double percentualDescontoEstudante, Double percentualDescontoIdoso) {
		this.percentualDescontoCrianca = percentualDescontoCrianca;
		this.percentualDescontoEstudante = percentualDescontoEstudante;
		this.percentualDescontoIdoso = percentualDescontoIdoso;
	}

	public Double getPercentualDescontoCrianca() {
		return percentualDescontoCrianca;
	}

	public Double getPercentualDescontoEstudante() {
		return percentualDescontoEstudante;
	}

	public Double getPercentualDescontoIdoso() {
		return percentualDescontoIdoso;
	}

}