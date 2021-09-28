package exercicios;

public class MainImovel {

	public static void main(String[] args) {
		Imovel i1 = new Imovel(1, "Centro", "apto", 25000.00);
		Imovel i2 = new Imovel(2, "Quitandinha", "casa", 98900.00);

		System.out.println(i1.bairro + " " + i1.valor);
		i1.reajuste();
		System.out.println("Valor reajustado: " + i1.valor);
		System.out.println(i1.checaCategoria() + "\n");

		System.out.println(i2.bairro + " " + i2.valor);
		i2.reajuste();
		System.out.println("Valor reajustado: " + i2.valor);
		System.out.println(i2.checaCategoria() + "\n");

	}

}
