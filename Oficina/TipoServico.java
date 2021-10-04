package aulas;

public enum TipoServico {
	OLEO(100.00), LAVAGEM(50.00), REVISAO(200.00);

	private TipoServico(Double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	private Double valorPorServico;

	public Double getValorPorServico() {
		return valorPorServico;
	}
}
