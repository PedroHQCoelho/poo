package aulas;

public class TestaEmpregado {

	public static void main(String[] args) {

		Empregado empregado1 = new Empregado("Pedro", "Coelho", 2500.00);
		Empregado empregado2 = new Empregado("André", "Coelho", 7500.00);

		empregado1.calculaImpostoRenda();
		empregado2.calculaImpostoRenda();

		System.out.println(empregado1);
		System.out.println(empregado2);
	}

}
