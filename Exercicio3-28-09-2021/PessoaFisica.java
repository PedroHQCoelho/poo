package aulas;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf, rg;

	PessoaFisica(String nome, Double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public Double calculoIR() {
		return this.rendimentos * 0.12;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s\nRG: %s - CPF: %s\nRendimentos: R$ %.2f", this.nome, this.rg, this.cpf,
				this.rendimentos);
	}
}
