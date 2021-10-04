package aulas;

public class TestaIR {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Pedro Coelho", 8900.00, "12214161708", "122750458");
		PessoaJuridica pj = new PessoaJuridica("Super Burger", 1000000.00, "32991718/0001-83", "1234567890");

		pf.calculoIR();
		pj.calculoIR();

		System.out.println(pf.toString());
		System.out.printf("Imposto a pagar: R$ %.2f \n", pf.calculoIR());

		System.out.println(pj.toString());
		System.out.printf("Imposto a pagar: R$ %.2f \n", pj.calculoIR());
	}

}
