package aulas;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Bradesco", "Cabelo Novo", "12345");
		Medico m = new Medico("Bradesco", "Doutor Cabeleira", 98765);
		Anestesista a = new Anestesista("Bradesco", "José Agulha", 77777777, "Forte");
		ControlePagamento controlpag = new ControlePagamento();
		
		c.calcularPagamento();
		m.calcularPagamento();
		a.calcularPagamento();
		
		controlpag.calcularTotalPago(c);
		controlpag.calcularTotalPago(m);
		controlpag.calcularTotalPago(a);
		
		System.out.println(c.toString());
		System.out.println(m.toString());
		System.out.println(a.toString());
		
		System.out.println("Total pago pelo plano: R$ " + String.format("%.2f", controlpag.getTotalPago()));
	}

}
