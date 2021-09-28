package exercicios;

public class Imovel {
	Integer codImovel;
	String bairro;
	String tipo;
	Double valor;

	public Imovel(Integer codImovel, String bairro, String tipo, Double valor) {
		this.codImovel = codImovel;
		this.bairro = bairro;
		this.tipo = tipo;
		this.valor = valor;
	}

	public void reajuste() {
		if (this.tipo == "casa") {
			this.valor = this.valor * 1.05;
		} else {
			this.valor = this.valor * 1.08;
		}
	}

	public String checaCategoria() {
		String categoria;
		if (this.valor < 10000) {
			categoria = "C";
		} else if (this.valor <= 50000) {
			categoria = "B";
		} else {
			categoria = "A";
		}
		return categoria;
	}

}
