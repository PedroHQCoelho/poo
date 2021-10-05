package aulas;

import java.time.LocalDate;

public class TesteAtleta {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta(1, "Marc-André ter Stegen", LocalDate.of(1992, 4, 30), "Goleiro", "Alemanha");
		Atleta atleta2 = new Atleta(2, "Sergiño Dest", LocalDate.of(2000, 11, 3), "Lateral", "Estados Unidos");
		Atleta atleta3 = new Atleta(3, "Gerard Piqué", LocalDate.of(1987, 2, 2), "Zagueiro", "Espanha");
		Atleta atleta4 = new Atleta(4, "Ronald Araujo", LocalDate.of(1999, 3, 7), "Zagueiro", "Uruguai");
		Atleta atleta5 = new Atleta(5, "Sergio Busquets", LocalDate.of(1988, 7, 16), "Meio-Campo", "Espanha");
		Atleta atleta6 = new Atleta(6, "Riqui Puig", LocalDate.of(1999, 8, 13), "Meio-Campo", "Espanha");
		Atleta atleta7 = new Atleta(7, "Ousmane Dembelé", LocalDate.of(1997, 8, 15), "Atacante", "França");
		Atleta atleta8 = new Atleta(9, "Memphis Depay", LocalDate.of(1994, 2, 13), "Atacante", "Holanda");
		Atleta atleta9 = new Atleta(10, "Ansu Fati", LocalDate.of(2002, 10, 31), "Atacante", "Espanha");
		Atleta atleta10 = new Atleta(11, "Yusuf Demir", LocalDate.of(2003, 6, 2), "Atacante", "Áustria");
		Atleta atleta11 = new Atleta(12, "Martin Braithwaite", LocalDate.of(1991, 6, 5), "Atacante", "Dinamarca");
		Atleta atleta12 = new Atleta(13, "Norberto Murara Neto", LocalDate.of(1989, 7, 19), "Goleiro", "Brasil");
		Atleta atleta13 = new Atleta(14, "Phillipe Coutinho", LocalDate.of(1992, 6, 12), "Meio-Campo", "Brasil");
		Atleta atleta14 = new Atleta(15, "Clément Lenglet", LocalDate.of(1995, 6, 17), "Zagueiro", "França");
		Atleta atleta15 = new Atleta(16, "Pedri González", LocalDate.of(2002, 11, 25), "Meio-Campo", "Espanha");
		Atleta atleta16 = new Atleta(17, "Luuk de Jong", LocalDate.of(1990, 8, 27), "Atacante", "Holanda");
		Atleta atleta17 = new Atleta(18, "Jordi Alba", LocalDate.of(1989, 3, 21), "Lateral", "Espanha");
		Atleta atleta18 = new Atleta(19, "Sergio Agüero", LocalDate.of(1988, 6, 2), "Atacante", "Argentina");
		Atleta atleta19 = new Atleta(20, "Sergi Roberto", LocalDate.of(1992, 2, 7), "Meio-Campo", "Espanha");
		Atleta atleta20 = new Atleta(21, "Frenkie de Jong", LocalDate.of(1997, 5, 12), "Meio-Campo", "Holanda");
		Atleta atleta21 = new Atleta(22, "Óscar Mingueza", LocalDate.of(1999, 5, 13), "Zagueiro", "Espanha");
		Atleta atleta22 = new Atleta(23, "Samuel Umtiti", LocalDate.of(1993, 11, 14), "Zagueiro", "França");
		Atleta atleta23 = new Atleta(24, "Eric Garcia", LocalDate.of(2001, 1, 9), "Zagueiro", "Espanha");
		Atleta atleta24 = new Atleta(26, "Iñaki Peña", LocalDate.of(1999, 3, 2), "Goleiro", "Espanha");
		Atleta atleta25 = new Atleta(28, "Nico González", LocalDate.of(2002, 1, 3), "Meio-Campo", "Espanha");
		Atleta atleta26 = new Atleta(30, "Gavi", LocalDate.of(2004, 8, 5), "Meio-Campo", "Espanha");
		Atleta atleta27 = new Atleta(31, "Alejandro Balde", LocalDate.of(2003, 10, 18), "Lateral", "Espanha");
		Atleta atleta28 = new Atleta(36, "Arnau Tenas", LocalDate.of(2001, 5, 30), "Goleiro", "Espanha");
		
		Time time = new Time("Barcelona", "Ronald Koeman", new Atleta[28]);
		time.adicionarAtletas(atleta1);
		time.adicionarAtletas(atleta2);
		time.adicionarAtletas(atleta3);
		time.adicionarAtletas(atleta4);
		time.adicionarAtletas(atleta5);
		time.adicionarAtletas(atleta6);
		time.adicionarAtletas(atleta7);
		time.adicionarAtletas(atleta8);
		time.adicionarAtletas(atleta9);
		time.adicionarAtletas(atleta10);
		time.adicionarAtletas(atleta11);
		time.adicionarAtletas(atleta12);
		time.adicionarAtletas(atleta13);
		time.adicionarAtletas(atleta14);
		time.adicionarAtletas(atleta15);
		time.adicionarAtletas(atleta16);
		time.adicionarAtletas(atleta17);
		time.adicionarAtletas(atleta18);
		time.adicionarAtletas(atleta19);
		time.adicionarAtletas(atleta20);
		time.adicionarAtletas(atleta21);
		time.adicionarAtletas(atleta22);
		time.adicionarAtletas(atleta23);
		time.adicionarAtletas(atleta24);
		time.adicionarAtletas(atleta25);
		time.adicionarAtletas(atleta26);
		time.adicionarAtletas(atleta27);
		time.adicionarAtletas(atleta28);
		
		System.out.println("Time: " + time.getNomeTime() + "\nTreinador: " + time.getTecnico());
		time.mostrarTime();

	}

}
