package aulas;

public class TesteVenda {

	public static void main(String[] args) {
		Produto produto1 = new BebidaAlcoolica ("Cerveja", 12.00, 5, 4.7);
		Produto produto2 = new BebidaAlcoolica ("Vinho", 150.00, 3, 12.00);
		Produto produto3 = new Eletrodomestico ("TV", 2000.00, 9, "220V");
		Produto produto4 = new Eletrodomestico ("Geladeira", 2352.64, 3, "Bivolt");
		Produto produto5 = new Eletrodomestico ("Rádio", 837.59, 1, "110V");
		
		produto1.vender(produto1.getQuantidadeDeItens());
		produto2.vender(produto2.getQuantidadeDeItens());
		produto3.vender(produto3.getQuantidadeDeItens());
		produto4.vender(produto4.getQuantidadeDeItens());
		produto5.vender(produto5.getQuantidadeDeItens());
		
		Double total = produto1.vender(produto1.getQuantidadeDeItens()) + produto2.vender(produto2.getQuantidadeDeItens()) + produto3.vender(produto3.getQuantidadeDeItens()) + produto4.vender(produto4.getQuantidadeDeItens()) + produto5.vender(produto5.getQuantidadeDeItens());
			
		
		System.out.println(produto1);
		System.out.println(produto2);
		System.out.println(produto3);
		System.out.println(produto4);
		System.out.println(produto5);
		
		System.out.printf("Total: R$ %.2f", total);

	}

}
