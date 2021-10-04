package aulas;

import java.time.LocalDate;

public final class Carro extends Veiculo {
	private String categoria;
	
	Carro (String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria){
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	@Override
	public Double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
	}
	
	@Override
	public Double trocarOleo() {
		if (dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valorCobrado = (valorCobrado + TipoServico.OLEO.getValorPorServico() - 50.00);
		} else {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		}
		return valorCobrado;
	}

	@Override
	public Double revisao() {
		if (dataConserto.getDayOfMonth() == 8) {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() * 0.9;
		} else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		}
		return valorCobrado;
	}
	
	@Override
	public String toString() {
		return String.format("Categoria: %s - %s", this.categoria, super.toString());
	}
}
