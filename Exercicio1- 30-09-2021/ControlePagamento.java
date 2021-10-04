package aulas;

public class ControlePagamento {
	private double totalPago;

	public Double getTotalPago() {
		return totalPago;
	}
	
	public void calcularTotalPago(Plano plano) {
		totalPago = totalPago + plano.getValorPago();
	}
}
