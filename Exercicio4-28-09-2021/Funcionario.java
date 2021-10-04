package aulas;

public class Funcionario {
	protected String nome, cpf, turno;
	protected Double salario;

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public Double participacao() {
		return this.salario * 0.01;
	}

	public Double getSalario() {
		return salario + this.participacao();
	}
}
