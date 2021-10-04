package aulas;

public class Clinica extends Plano{
	private String nome, cgc;

	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}
	
	@Override
	public String toString() {
		return String.format("Clínica: %s\n%s", this.nome, super.toString());
	}

	public String getNome() {
		return nome;
	}

	public String getCgc() {
		return cgc;
	}
	
}
