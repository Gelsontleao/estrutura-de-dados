package one.digitalinovation;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "João");
		aluno.put("Idade", "17");
		aluno.put("Média", "8,5");
		aluno.put("Turma", "3A");
		
		System.out.println(aluno);
		
		System.out.println(aluno.keySet());
		System.out.println(aluno.values());
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno);
		
		Map<String, String> aluna = new HashMap<>();
		
		aluno.put("Nome", "Maria");
		aluno.put("Idade", "18");
		aluno.put("Média", "8,9");
		aluno.put("Turma", "3B");
		
		listaAlunos.add(aluna);
		
		System.out.println(listaAlunos);
	}

}
