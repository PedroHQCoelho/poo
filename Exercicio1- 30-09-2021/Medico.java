package aulas;

public class Medico extends Plano{
	protected String nome;
	private Integer crm;
	public Medico(String empresa, String nome, Integer crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public Integer getCrm() {
		return crm;
	}
	
	@Override
	public String toString() {
		return String.format("Médico: %s - %s", this.nome, super.toString());
	}
	
	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.1;
	}
}
