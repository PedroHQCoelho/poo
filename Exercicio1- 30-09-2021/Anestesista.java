package aulas;

public class Anestesista extends Medico{
	private String tipoAnestesia;
	
	public Anestesista(String empresa, String nome, Integer crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}


	@Override
	public String toString() {
		return String.format("Anestesista - %s - Tipo de Anestesia: %s", super.toString(), tipoAnestesia);
	}


	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() + 1000.00;
	}

	
	

}
