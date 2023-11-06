package listas;

public class ListaVetores {
	private int tamanho;
	private int[] vetor;
	
	public ListaVetores(int capacidade) {
		tamanho = 0;
		vetor = new int[capacidade];
	}
	
	public void add(int ind, int elem) {
		if (ind >=0 && ind <= tamanho && tamanho < vetor.length) {
			for(int i = tamanho; i > ind; i--) {
				vetor[i] = vetor[i-1];
			}
			vetor[ind] = elem;
			tamanho++;
		} else {
			System.out.println("Índice inválido");
		}
	}
	
	public void remove(int ind) {
		if(ind >=0 && ind < tamanho) {
			for (int i = ind; i < tamanho - 1; i++) {
				vetor[i] = vetor[i + 1];
			}
			tamanho--;
			vetor[tamanho] = 0;
		} else {
			System.out.println("Índice inválido");
		}
	}
	
	public void getValor(int i) {
		System.out.println("O valor do índice " + i + "é: " +  vetor[i]);
	}
	
	public void printLista() {
		System.out.println("Valores presentes na Lista: ");
		for (int i : vetor) {
			System.out.println(i);
		}
	}
}