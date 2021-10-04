package aulas;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj, inscEstadual;

	public PessoaJuridica(String nome, Double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	public Double calculoIR() {
		return this.rendimentos * 0.15;
	}

	@Override
	public String toString() {
		return String.format("\nNome da Empresa: %s\nCNPJ: %s - Inscrição Estadual: %s\nRendimentos: R$ %.2f", this.nome,
				this.cnpj, this.inscEstadual, this.rendimentos);
	}

}
