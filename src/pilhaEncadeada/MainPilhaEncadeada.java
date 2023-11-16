package pilhaEncadeada;

public class MainPilhaEncadeada {
	public static void main(String[] args) {
		PilhaEncadeada pilha = new PilhaEncadeada();
		
		System.out.println("A pilha está vazia? " + pilha.isEmpty());
		System.out.println("Tamanho da pilha: " +  pilha.tamanho());
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		
		pilha.showPilha();
		
		System.out.println("A pilha está vazia? " + pilha.isEmpty());
		System.out.println("Tamanho da pilha: " +  pilha.tamanho());
		
		pilha.pop();
		
		pilha.showPilha();
	}
}
