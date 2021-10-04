package aulas;

import java.time.LocalDate;

public class Pedido {
	private Integer numero;
	private LocalDate dataPedido;
	private Double quantidade;
	private Double valor;
	public static Integer totalPedido = 0;
	
	
	public Pedido (Integer numero, LocalDate dataPedido, Double quantidade, Double valor) {
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		Pedido.totalPedido = Pedido.totalPedido + 1;
		}

	public static void setTotalPedido(Integer totalPedido) {
		Pedido.totalPedido = totalPedido;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	
	public Double getQuantidade() {
		return quantidade;
	}
	
	public Double getValor() {
		return valor;
	}
	
	
	public static void getTotalPedido(Integer totalPedido) {
		totalPedido = Pedido.totalPedido;
	}

	public void domingo() {
		if (dataPedido.getDayOfWeek().name() =="SUNDAY") {
			this.valor = this.valor - (this.valor/10);
		}
	}
	
	public Double calculaTotal() {
		Double total = getQuantidade() * getValor();
        return total;
	}
	
	@Override
	public String toString() {
		return String.format("Pedido: %d  - Data:%tD - Quantidade: %.0f - Valor da Unidade: R$%.2f - Valor Total: R$%.2f", this.numero, this.dataPedido,  this.quantidade, this.valor, calculaTotal());
	}
}
