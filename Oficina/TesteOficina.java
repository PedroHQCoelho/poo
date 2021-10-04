package aulas;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario1 = new Proprietario("Nilton Babaquinha");
		Veiculo veiculo1 = new Carro("Sandero", LocalDate.of(2021, 8, 14), proprietario1, "GT Line");

		veiculo1.trocarOleo();
		veiculo1.revisao();

		System.out.println("Proprietário: " + proprietario1.getNome());
		System.out.println("Veículo: " + veiculo1.toString());

		Proprietario proprietario2 = new Proprietario("Vinicius Peidorreiro");
		Veiculo veiculo2 = new Carro("Sandero", LocalDate.now(), proprietario2, "Expression 1.6");

		veiculo2.trocarOleo();
		veiculo2.lavarVeiculo();

		System.out.println("Proprietário: " + proprietario2.getNome());
		System.out.println("Veículo - " + veiculo2.toString());
		
		Proprietario proprietario3 = new Proprietario("Johnny Blaze");
		Veiculo veiculo3 = new Moto("Hell Cycle", LocalDate.now(), proprietario3, 1000);
		
		veiculo3.lavarVeiculo();
		veiculo3.trocarOleo();
		veiculo3.revisao();
		
		System.out.println("Proprietário: " + proprietario3.getNome());
		System.out.println("Veículo - " + veiculo3.toString());
	}

}
