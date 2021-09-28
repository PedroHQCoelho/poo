package aulas;

public class Medico {
	Integer crm;
	String nome;
	Double salario;
	Double valorConsulta;
	static Integer totalMedicos = 0;
	
	
	
	public Integer getCrm() {
		return crm;
	}



	public void setCrm(Integer crm) {
		this.crm = crm;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
	}



	public Double getValorConsulta() {
		return valorConsulta;
	}



	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}



	public static Integer getTotalMedicos() {
		return totalMedicos;
	}

	public static void setTotalMedicos(Integer totalMedicos) {
		Medico.totalMedicos = totalMedicos;
	}


	public Medico(Integer crm, String nome, Double salario, Double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		Medico.totalMedicos = Medico.totalMedicos + 1;
	}
	
	
	
	public void pagamentoDinheiro(Double valorConsulta) {
		salario = salario + valorConsulta;
	}
	
	public void pagamentoPlano(Double valorConsulta) {
		salario = salario + (valorConsulta * 0.7);
	}
	

}
