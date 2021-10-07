package aula10;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestaDataNascimento {

	public static void main(String[] args) {
		LocalDateTime dataNasc = LocalDateTime.of(1987, 7, 24, 7, 40, 00);
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Data de Nascimento: " + dataNasc.format(formatador));
		System.out.println("Hoje: " + agora.format(formatador));

		System.out.println("Ano de nascimento era bissexto? " + dataNasc.toLocalDate().isLeapYear());

		Duration duracao = Duration.between(dataNasc, agora);
		System.out.println("Desde o nascimento, se passaram " + duracao.getSeconds() + " segundos.");

	}

}
