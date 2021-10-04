package aulas;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Jorge Salgado", 8000.00);
		Assistente assistente = new Assistente("Alexandre Pássaro", 5000.00, 150.00);

		System.out.println(gerente.toString());
		System.out.printf("Participação nos Lucros: R$ %.2f \n", gerente.participacao());
		System.out.printf("Salário Bruto: R$ %.2f \n", gerente.getSalario());

		System.out.println(assistente.toString());
		System.out.printf("Participação nos Lucros: R$ %.2f \n", assistente.participacao());
		System.out.printf("Salário Bruto: R$ %.2f", assistente.getSalario());
	}

}
