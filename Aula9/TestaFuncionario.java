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
			System.out.println(funcionario[i].getNome() + " - " + funcionario[i].getCargo());
			System.out.println("R$ " + String.format("%.2f", funcionario[i].abonoSalario(150.00)));
		}

	}

}
