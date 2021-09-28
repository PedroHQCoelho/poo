package exercicios;

public class Calculadora {
	public Double calcular(Double a, Double b, Integer op) {
		double y = 0;
		switch (op) {
		case 1:
			y = a + b;
			break;
		case 2:
			y = a - b;
			break;
		case 3:
			y = a * b;
			break;
		case 4:
			y = a / b;
			break;

		default:
			break;
		}
		return y;
	}

}
