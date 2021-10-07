package aula10;

import java.util.HashMap;
import java.util.Map;

public class Veiculos {

	public static void main(String[] args) {
		Map<String, String> carros = new HashMap<String, String>();
		carros.put("Renault", "Sandero");
		carros.put("Fiat", "Uno");
		carros.put("Chevrolet", "Camaro");
		carros.put("Volkswagen", "Gol");
		carros.put("Nissan", "Versa");

		for (String s : carros.keySet()) {
			System.out.println(s);
		}

		for (Map.Entry<String, String> entrada : carros.entrySet()) {
			System.out.println(entrada);
		}
	}

}
