package aulas;

import java.time.LocalDate;

public class MainPedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido (1, LocalDate.now(), 1.00, 199.99);
		Pedido pedido2 = new Pedido (2, LocalDate.of(2021, 9, 30), 4.00, 199.99);
		Pedido pedido3 = new Pedido (3, LocalDate.of(2021, 10, 3), 2.00, 199.99);
		
		pedido1.domingo();
		pedido2.domingo();
		pedido3.domingo();
		
		System.out.println(pedido1);
		System.out.println(pedido2);
		System.out.println(pedido3);
		System.out.println("\nTotal de pedidos: " + Pedido.totalPedido);

	}

}
