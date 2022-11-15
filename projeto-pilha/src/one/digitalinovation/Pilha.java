package one.digitalinovation;

public class Pilha {
	
	private No refNoEntradaPilha;

	public Pilha() {		
		this.refNoEntradaPilha = null;
	}
	
	public void push(No novoNo) { //coloca o nó no topo da pilha 
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	
	public No pop() { //exclui o nó do topo da pilha
		if(!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		} else {
			return null;
		}
	
	}
	
	
	public No top() {
		return refNoEntradaPilha; //retorna o nó do topo da pilha
	}
	
	public boolean isEmpty() { //verifica se a pilha está vazia
		if (refNoEntradaPilha == null) {
			return true;
		} else {
			return false;
		} 
		
	}
	
	@Override
	public String toString() {
		
		String stringRetorno = "-------------\n";
		stringRetorno += "    Pilha\n";
		stringRetorno += "-------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while (true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			} else {
				break;
			}
		}
		
		stringRetorno += "=============\n";
		return stringRetorno;
	}

}
