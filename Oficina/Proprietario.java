package aulas;

public class Proprietario {
	private String nome;

	Proprietario(String nome) {
		this.nome = nome;
	}

	@Override

	public String toString() {
		return String.format("Proprietário: %s", this.nome);
	}

	public String getNome() {
		return nome;
	}
}