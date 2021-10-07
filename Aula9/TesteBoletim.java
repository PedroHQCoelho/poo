package aulas;

import java.util.ArrayList;
import java.util.List;

public class TesteBoletim {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Pedro", 9.0, 10.0);
		Aluno aluno2 = new Aluno("Douglas", -5.0, -1.0);
		Aluno aluno3 = new Aluno("Igor", 5.0, 8.0);
		Aluno aluno4 = new Aluno("José", 11.0, 12.0);
		Aluno aluno5 = new Aluno("Pâmela", 10.0, 10.0);
		Aluno aluno6 = new Aluno("Paulo", 7.0, 8.5);
		Aluno aluno7 = new Aluno("Breno", 7.5, 7.5);
		Aluno aluno8 = new Aluno("Vitor", 9.5, 6.5);
		
		List<Aluno> Aluno = new ArrayList<Aluno>();
		Aluno.add(aluno1);
		Aluno.add(aluno2);
		Aluno.add(aluno3);
		Aluno.add(aluno4);
		Aluno.add(aluno5);
		Aluno.add(aluno6);
		Aluno.add(aluno7);
		Aluno.add(aluno8);
		
		for (Integer i = 0; i < Aluno.size(); i++) {
    		try{
          		Aluno aluno = (Aluno) Aluno.get(i);
          		aluno.calcularMedia();
            		System.out.println(aluno.toString());
         	}
         	catch(AlunoException e){
                	System.err.println(e.getMessage());
         	}
	}
	}

}
