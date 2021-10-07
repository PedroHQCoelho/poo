package aulas;

public class Aluno {
	private String nome;
	private Double nota1, nota2;
	public Aluno(String nome, Double nota1, Double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public String getNome() {
		return nome;
	}
	public Double getNota1() {
		return nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	
	public double calcularMedia() throws AlunoException{
		if (nota1 < 0.0 || nota1 > 10.0 || nota2 < 0.0 || nota2 > 10.0) {
			 throw new AlunoException("A nota precisa ser entre 0 e 10");
		}else {
		return ((getNota1() + getNota2())/2);
	}
	}
	
	public String toString() {
		try {
			return String.format("Aluno: " + getNome() + " Nota 1: " + getNota1() + " Nota 2: " + getNota2() + " Média: " + calcularMedia());
		} catch (AlunoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nome;
	}
	
}
