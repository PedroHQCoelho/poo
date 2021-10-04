package aulas;

public class TestaContato {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Estado estado2 = new Estado("São Paulo", "SP");

		Cidade cidade1 = new Cidade("Teresópolis", estado1);
		Cidade cidade2 = new Cidade("São Paulo", estado2);

		Endereco endereco1 = new Endereco("Rua Paraíba 90", "Araras", "25957-265", cidade1);
		Endereco endereco2 = new Endereco("Rua Galvão Bueno 200", "Liberdade", "01506-000", cidade2);

		Telefone telefone1 = new Telefone("21 984586742");
		Telefone telefone2 = new Telefone("21 36424266");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;

		Telefone telefone3 = new Telefone("11 959651727");
		Telefone[] telefone = new Telefone[1];
		telefone[0] = telefone3;

		Contato contato1 = new Contato("Pedro", endereco1);
		Contato contato2 = new Contato("Mainny", endereco2);
		contato1.setTelefones(telefones);
		contato2.setTelefones(telefone);

		System.out.println("Nome: " + contato1.getNome() + "\nEndereço: " + contato1.getEndereco().getRua()
				+ " Bairro: " + contato1.getEndereco().getBairro() + "\nCidade: "
				+ contato1.getEndereco().getCidade().getNomeCidade() + " - "
				+ contato1.getEndereco().getCidade().getEstado().getSigla() + "\nCEP: "
				+ contato1.getEndereco().getCep());
		contato1.MostrarTelefones();

		System.out.println("\nNome: " + contato2.getNome() + "\nEndereço: " + contato2.getEndereco().getRua()
				+ " Bairro: " + contato2.getEndereco().getBairro() + "\nCidade: "
				+ contato2.getEndereco().getCidade().getNomeCidade() + " - "
				+ contato2.getEndereco().getCidade().getEstado().getSigla() + "\nCEP: "
				+ contato2.getEndereco().getCep());
		contato2.MostrarTelefones();
	}

}
