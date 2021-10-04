package aulas;

public class Empregado {
	private String nome;
	private String sobrenome;
	private Double salario;

	public Empregado(String nome, String sobrenome, Double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void calculaImpostoRenda() {

		if (this.salario < 1903.98) {
			salario = this.salario + 0;
		} else if (this.salario >= 1903.98 && this.salario < 2826.65) {
			salario = this.salario - (this.salario * 0.075);
		} else if (this.salario >= 2826.65 && this.salario < 3751.05) {
			salario = this.salario - (this.salario * 0.15);
		} else if (this.salario >= 3751.05 && this.salario < 4664.68) {
			salario = this.salario - (this.salario * 0.225);
		} else if (this.salario >= 4664.68) {
			salario = this.salario - (this.salario * 0.275);
		}
	}
	

	@Override
	public String toString() {
		return String.format("Nome do empregado: %s %s - Salário: %.2f", this.nome, this.sobrenome, this.salario);
	}
}
