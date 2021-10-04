package aulas;

public class Plano {
	protected String empresa;
	protected Double valorPago = 80.00;
	protected Double valorISS = 5.00;
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return String.format("Plano: %s - Valor Pago: R$ %.2f", this.empresa, getValorPago());
	}
	
	public Double calcularPagamento() {
		return valorPago = valorPago - (valorPago * (valorISS/100));
	}

	public Double getValorPago() {
		return valorPago;
	}
}
