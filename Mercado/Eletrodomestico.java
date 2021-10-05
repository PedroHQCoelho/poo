package aulas;

public class Eletrodomestico extends Produto {
	private String voltagem;

	public Eletrodomestico(String nome, Double valor, Integer quantidadeDeItem, String voltagem) {
		super(nome, valor, quantidadeDeItem);
		this.voltagem = voltagem;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Voltagem: %s", super.toString(), getVoltagem());
	}
}
