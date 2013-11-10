package theater.tickets.dojo;

public enum Tipo {

	CRIANCA(5.5),
	ESTUDANTE(8.0),
	IDOSO(6.0);
	
	private Double preco;

	private Tipo(Double preco) {
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}
}