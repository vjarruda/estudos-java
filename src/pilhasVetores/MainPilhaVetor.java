package pilhasVetores;

public class MainPilhaVetor {
	public static void main(String[] args) {
		Pilha pilha = new Pilha(5);
		
		System.out.println("Pilha Vazia? " + pilha.isEmpty());
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		
		System.out.println("Pilha Vazia? " + pilha.isEmpty());
		System.out.println("Tamanho da pilha: " + pilha.size());
		System.out.println("Elemento do topo: " + pilha.top());
		
		pilha.showPilha();
		
		pilha.pop();
		
		pilha.showPilha();
	}
}
