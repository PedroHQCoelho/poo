package aulas;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario[] = new Funcionario[2];
		funcionario[0] = new Funcionario();
		funcionario[0].setNome("Pedro");
		funcionario[0].setCargo("Diretor");
		funcionario[0].setSalario(8000.00);

		funcionario[1] = new Funcionario();
		funcionario[1].setNome("André");
		funcionario[1].setCargo("Repórter");
		funcionario[1].setSalario(7000.00);

		for (Integer i = 0; i < funcionario.length; i++) {
			System.out.println("Nome: " + funcionario[i].getNome() + "\nCargo: " + funcionario[i].getCargo()
					+ "\nSalário com abono: R$ " + String.format("%.2f\n", funcionario[i].abonoSalario(150.00)));
		}

	}

}

