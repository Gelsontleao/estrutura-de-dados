package one.digitalinovation;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Stack<Carro> stackCarros = new Stack<>(); //Chama o método de pilha
		
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Chevrolet"));
		stackCarros.push(new Carro("Fiat"));
		
		System.out.println(stackCarros); //Lista os itens na pilha
		System.out.println(stackCarros.pop()); //Retira o último item da pilha
		System.out.println(stackCarros);
		System.out.println(stackCarros.peek()); //Mostra o elemento no topo da pilha
		System.out.println(stackCarros);
		System.out.println(stackCarros.empty()); //Mostra se nossa pilha está vazia
	}

}
