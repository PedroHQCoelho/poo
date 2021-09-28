package aulas;

public class TestaMedico {

	public static void main(String[] args) {
		Medico medico1 = new Medico(12345, "Ana Maria", 0.00, 250.00);
		Medico medico2 = new Medico(456789, "Antônio", 0.00, 300.00);
		
		medico1.pagamentoDinheiro(250.00);
		medico2.pagamentoPlano(300.00);
		
		System.out.println("CRM: " + medico1.getCrm());
		System.out.println("Nome: " + medico1.getNome());
		System.out.println("Salário:" + medico1.getSalario());
		System.out.println("Valor da Consulta: " + medico1.getValorConsulta());
		System.out.println("\nCRM: " + medico2.getCrm());
		System.out.println("Nome: " + medico2.getNome());
		System.out.println("Salário: " + medico2.getSalario());
		System.out.println("Valor da Consulta: " + medico2.getValorConsulta());
		System.out.println("\nTotal de médicos: " + Medico.getTotalMedicos());
	}

}
