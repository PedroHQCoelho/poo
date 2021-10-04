package aulas;

public class Assistente extends Funcionario {
	private Double adicional;

	public Assistente(String nome, Double salario, Double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return String.format("\nAssistente: \nNome: %s - Salario: R$ %.2f - Adicional: R$ %.2f", nome, salario,
				adicional);
	}

	@Override
	public Double getSalario() {
		return super.getSalario() + this.adicional;
	}

}
