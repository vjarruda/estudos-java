package listaEncadeada;

public class ListaEncadeada {
	private No primeiro;
	private int tamanho;

	public ListaEncadeada() {
		primeiro =  null;
		tamanho = 0;
	}
	
	public void add(int indice, int elemento) {
	    if (indice < 0 || indice > tamanho) {
	        System.out.println("Índice inválido.");
	        return;
	    }

	    No novo = new No(elemento);
	    if (indice == 0) {
	        novo.proximo = primeiro;
	        primeiro = novo;
	    } else {
	        No atual = primeiro;
	        No anterior = null;
	        for (int i = 0; i < indice; i++) {
	            anterior = atual;
	            atual = atual.proximo;
	        }
	        novo.proximo = atual;
	        anterior.proximo = novo;
	    }
	    tamanho++;
	}
	
	public void remove(int indice) {
		if(indice < 0  || indice >= tamanho) {
			System.out.println("Índice inválido.");
			return;
		}
		
		if (indice == 0) {
			primeiro = primeiro.proximo;
		} else {
			No anterior = null;
			No atual = primeiro;
			for(int i = 0; i < indice; i++) {
				anterior = atual;
				atual = atual.proximo;
			}
			anterior.proximo = atual.proximo;
		}
		tamanho--;
	}
	
	public void mostrarLista() {
		No atual = primeiro;
		System.out.println("Valores na lista: ");
		while(atual != null) {
			System.out.println(atual.valor);
			atual = atual.proximo;
		}
		System.out.println(" ");
	}
}
