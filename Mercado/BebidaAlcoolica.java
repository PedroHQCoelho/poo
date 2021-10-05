package aulas;

public class BebidaAlcoolica extends Produto {
	private Double teorAlcoolico;

	public BebidaAlcoolica(String nome, Double valor, Integer quantidadeDeItem, Double teorAlcoolico) {
		super(nome, valor, quantidadeDeItem);
		this.teorAlcoolico = teorAlcoolico;
	}

	public Double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(Double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Teor Alcóolico: %.2f%%", super.toString(), getTeorAlcoolico());
	}
}
