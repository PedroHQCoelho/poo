package aulas;

import java.time.LocalDate;

public final class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, Integer cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public Double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public Double trocarOleo() {
		return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public Double revisao() {
		return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();

	}

	@Override
	public String toString() {
		return String.format("%d Cilindradas - %s", this.cilindradas, super.toString());
	}
	
}
