package aulas;

public class Estado {
	private String nomeEstado, sigla;

	public Estado(String nomeEstado, String sigla) {
		super();
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}
}
