package aulas;

import java.time.LocalDate;
import java.time.Period;

public class Atleta {
	private Integer numeroCamisa;
	private String nome;
	private LocalDate dataNascimento;
	private String posicao;
	private Integer idade;
	private String pais;

	public Atleta(Integer numeroCamisa, String nome, LocalDate dataNascimento, String posicao, String pais) {
		super();
		this.numeroCamisa = numeroCamisa;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.posicao = posicao;
		this.pais = pais;
	}

	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}
	
	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public Integer calculaIdade() {
		
		idade = Period.between(getDataNascimento(), LocalDate.now()).getYears();
		return idade;
	}

	public String getPosicao() {
		return posicao;
	}

	public String getPais() {
		return pais;
	}	
}
