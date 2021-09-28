package exercicios;

import javax.swing.JOptionPane;

public class MainCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Integer escolha;
		Double y;
		String menu = "Calculadora\n\n" + "1 - Soma\n" + "2 - Subtração\n" + "3 - Multiplicação\n" + "4 - Divisão\n" + "5 - Sair";
		escolha = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "CALCULADORA", JOptionPane.QUESTION_MESSAGE));

		while (escolha != 5) {
			if (escolha >=6 || escolha <=0) {
				JOptionPane.showMessageDialog(null, "Número Errado - Tente um número correto", "ERRO", JOptionPane.ERROR_MESSAGE);
			}else {
			String x1 = JOptionPane.showInputDialog("Primeiro Número: ");
			String x2 = JOptionPane.showInputDialog("Segundo Número: ");
			y = calc.calcular(Double.parseDouble(x1), Double.parseDouble(x2), escolha);
			JOptionPane.showMessageDialog(null, y);
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "CALCULADORA", JOptionPane.OK_OPTION));
			}
		}
	}

}
