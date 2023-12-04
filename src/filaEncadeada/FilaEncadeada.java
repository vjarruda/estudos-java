package filaEncadeada;

public class FilaEncadeada {
	private No inicio;
	private No fim;
	private int tamanho;
	
	public FilaEncadeada() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public void enqueue(String valor) {
		No novo = new No(valor);
		if(isEmpty()) {
			inicio = novo;
			fim = novo;
		} else {
			fim.proximo = novo;
			fim = novo;
		}
		tamanho++;
	}
	
	public String dequeue() {
		if(!isEmpty()) {
			String valorRemovido = inicio.valor;
			inicio = inicio.proximo;
			tamanho --;
			return valorRemovido;
		} else {
			System.out.println("Fila vazia");
			return null;
		}
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public String front() {
		if(!isEmpty()) {
			return inicio.valor;
		} else {
			System.out.println("Fila vazia");
			return null;
		}
	}
	
	public int size() {
		return tamanho;
	}
	
	public void showFila() {
		System.out.println("Valores da fila: ");
		No atual = inicio;
		while(atual != null) {
			System.out.println(atual.valor);
			atual = atual.proximo;
		}
		
		if(isEmpty()) {
			System.out.println("fila vazia");
		}
	}
}
