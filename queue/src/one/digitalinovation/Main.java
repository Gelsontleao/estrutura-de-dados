package one.digitalinovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Queue<Carro> queueCarros = new LinkedList<>(); //chama o método fila
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Fiat"));
		queueCarros.add(new Carro("Nissan"));
		
		System.out.println(queueCarros);
		System.out.println(queueCarros.add(new Carro("Subaru"))); //adiciona o elemento a lista, se não conseguir irá retornar um erro
		System.out.println(queueCarros);
		System.out.println(queueCarros.offer(new Carro("Ferrari"))); //adiciona o elemento a lista, se não conseguir irá retornar false
		System.out.println(queueCarros);
		System.out.println(queueCarros.peek()); //mostra o primeiro elemento da fila
		System.out.println(queueCarros);
		System.out.println(queueCarros.poll()); //remove o primeiro elemento da fila
		System.out.println(queueCarros);
		System.out.println(queueCarros.isEmpty()); //mostra se a fila está vazia
		System.out.println(queueCarros.size()); //mostra o tamanho da fila
	}

}
