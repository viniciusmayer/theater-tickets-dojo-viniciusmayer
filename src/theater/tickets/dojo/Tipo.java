package theater.tickets.dojo;

public enum Tipo {

	CRIANCA {
		@Override
		public Ticket getTicket(DiaDaSemana diaDaSemana) {
			return new TicketCrianca(5.5, diaDaSemana);
		}
	},
	ESTUDANTE {
		@Override
		public Ticket getTicket(DiaDaSemana diaDaSemana) {
			return new TicketEstudante(8.0, diaDaSemana);
		}
	},
	IDOSO {
		@Override
		public Ticket getTicket(DiaDaSemana diaDaSemana) {
			return new TicketIdoso(6.0, diaDaSemana);
		}
	};
	
	public abstract Ticket getTicket(DiaDaSemana diaDaSemana);
}