package aulas;

public class Funcionario {
	private String nome, cargo;
	private Double salario;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double abonoSalario(Double abono) {
		return this.salario = this.salario + abono;
	}
}
