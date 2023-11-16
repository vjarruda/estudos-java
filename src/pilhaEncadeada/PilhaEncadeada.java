package pilhaEncadeada;

public class PilhaEncadeada {
	private No topo;
	private int tamanho;
	
	
	public PilhaEncadeada() {
		this.topo = null;
		this.tamanho = 0;
	}
	
	public void push(int valor) {
		No novo = new No(valor);
		if(isEmpty()) {
			topo = novo;
		} else {
			novo.proximo = topo;
			topo = novo;
		}
		tamanho++;
	}
	
	public void pop() {
		if(!isEmpty()) {
			topo = topo.proximo;
			tamanho--;
		} else {
			System.out.println("Pilha Vazia");
		}
	}
	
	public int top() { 
		if(!isEmpty()) {
			return topo.valor;
		} else {
			throw new IllegalStateException("Pilha Vazia");
		}
	}
	
	public void showPilha() {
		System.out.println("Valores na pilha: ");
		No atual = topo;
		while(atual != null) {
			System.out.println(atual.valor);
			atual = atual.proximo;
		}
		if(isEmpty()) {
			System.out.println("Pilha Vazia");
		}
	}
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public int tamanho() {
		return tamanho;
	}
}
