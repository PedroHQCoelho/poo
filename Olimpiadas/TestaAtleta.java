package aulas;

public class TestaAtleta {

	public static void main(String[] args) {

		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("China");

		Atleta atleta1 = new Atleta("Pedro Coelho", 75.0, pais1);
		Atleta atleta2 = new Atleta("Bruce Lee", 65.0, pais2);
		Atleta atleta3 = new Atleta("Sammo Hung", 95.0, pais2);

		atleta1.verificaSituacao(atleta1.getPeso());
		atleta2.verificaSituacao(atleta2.getPeso());
		atleta3.verificaSituacao(atleta3.getPeso());

		System.out.println(
				"Nome: " + atleta1.getNome() + "\nPaís: " + atleta1.getPais().getNome() + "\nPeso: " + atleta1.getPeso()
						+ "Kg - Modalidade: " + atleta1.getModalidade() + "\nSituação: " + atleta1.classificacao);
		System.out.println("\nNome: " + atleta2.getNome() + "\nPaís: " + atleta2.getPais().getNome() + "\nPeso: "
				+ atleta2.getPeso() + "Kg - Modalidade: " + atleta2.getModalidade() + "\nSituação: "
				+ atleta2.classificacao);
		System.out.println("\nNome: " + atleta3.getNome() + "\nPaís: " + atleta3.getPais().getNome() + "\nPeso: "
				+ atleta3.getPeso() + "Kg - Modalidade: " + atleta3.getModalidade() + "\nSituação: "
				+ atleta3.classificacao);

		System.out.println("\nTotal Participantes: " + Atleta.getTotalParticipantes());

	}

}
