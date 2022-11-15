package com.projetono;

public class Main {

	public static void main(String[] args) {
		
		No<String> no1 = new No<>("Conteúdo Nó 1");
		
		No<String> no2 = new No<>("Conteúdo Nó 2");
		no1.setProximoNo(no2);
		
		No<String> no3 = new No<>("Conteúdo Nó 3");
		no2.setProximoNo(no3);
		
		No<String> no4 = new No<>("Conteúdo Nó 4");
		no3.setProximoNo(no4);
		
		//no1 -> no2 -> no3 -> n4 -> null
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		System.out.println("-----xxxxx-----");
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}

}
