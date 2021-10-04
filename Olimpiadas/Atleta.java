package aulas;

public class Atleta implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	public static Integer totalParticipantes = 0;
	private Pais pais;
	public String classificacao;

	public Atleta(String nome, Double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		totalParticipantes = totalParticipantes + 1;
	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	public Pais getPais() {
		return pais;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public static Integer getTotalParticipantes() {
		return totalParticipantes;
	}

	@Override
	public String verificaSituacao(Double peso) {

		if (this.peso > 90) {
			this.modalidade = "Peso Pesado";
			classificacao = "Participará";
		} else if (this.peso > 60 && this.peso < 90) {
			this.modalidade = "Peso Médio";
			classificacao = "Participará";
		} else {
			classificacao = "Não participará";
		}

		return classificacao;
	}
}
