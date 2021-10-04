package aulas;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public String toString() {
		return String.format("Gerente: \nNome: %s - Salario: R$ %.2f", nome, salario);
	}

	public Double participacao() {
		return super.participacao() + 200;
	}
}
