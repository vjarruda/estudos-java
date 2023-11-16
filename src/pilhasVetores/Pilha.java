package pilhasVetores;

public class Pilha {
	private int[] valores;
	private int tamanho;
	private int capacidade;

	public Pilha(int capacidade) {
		this.capacidade = capacidade;
		this.valores = new int[capacidade];
		this.tamanho = 0;
	}

	public void push(int valor) {
		if (tamanho < capacidade) {
			valores[tamanho] = valor;
			tamanho++;
		} else {
			System.out.println("A pilha está cheia.");
		}
	}

	public void pop() {
		if (tamanho > 0) {
			tamanho--;
			valores[tamanho] = 0;
		} else {
			System.out.println("Pilha Vazia");
		}
	}

	public int size() {
		return tamanho;
	}

	public boolean isEmpty() {
		return tamanho == 0;
	}

	public int top() {
		return valores[tamanho - 1];
	}

	public void showPilha() {
		if(!isEmpty()) {
			System.out.println("Valores da pilha: ");
			for (int i : valores) {
				if(i != 0 ) {
					System.out.println(i);
				}
			}
			System.out.println(" ");
		} else {
			System.out.println("Pilha Vazia");
		} 
	} 
}

