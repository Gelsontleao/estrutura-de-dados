package one.digitalinovation;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> listCarros = new ArrayList<>();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Fiat"));
		listCarros.add(new Carro("Nissan"));
		listCarros.add(new Carro("Ferrari"));
		
		System.out.println(listCarros);
		System.out.println(listCarros.contains(new Carro("Ford"))); //verifica se o item informado está na lista
		
		System.out.println(listCarros.get(2)); //pega o carro da lista na posição definida
		
		System.out.println(listCarros.indexOf(new Carro("Fiat"))); //retorna a posição do elemento informado
		
		System.out.println(listCarros.remove(1));
		System.out.println(listCarros);
	}

}
