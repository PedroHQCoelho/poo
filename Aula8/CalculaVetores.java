package aulas;

public class CalculaVetores {

	public static void main(String[] args) {
		Integer[] numerador = { 1, 2, 3, 4, 5 };
		Integer[] denominador = { 3, 0, 2 };
		

		for (Integer i = 0; i < numerador.length; i++) {
			try {
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
			} catch (ArithmeticException e) {
				System.out.println("ERRO");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERRO - Vetor Inexistente");
			}
		}
	}
}