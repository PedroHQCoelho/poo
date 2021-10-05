package aulas;

import java.util.Scanner;

public class LeitorNumero {

	public static void main(String[] args) {

		LeitorNumero l = new LeitorNumero();
		System.out.println("Digite um número inteiro: ");
		try {
			Integer n = l.lerNumero();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("Falha ao ler o número");
		}
	}

	public Integer lerNumero() throws Exception {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		in.close();
		return n;
	}

}
