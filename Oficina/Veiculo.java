package aulas;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return String.format("Modelo: %s - Data do Serviço:%tD - Valor Cobrado: %.2f", this.modelo, this.dataConserto, getValorCobrado());
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}
}
