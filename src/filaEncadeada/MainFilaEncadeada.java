package filaEncadeada;

import java.util.Scanner;

public class MainFilaEncadeada {
	public static void main(String[] args) {
		FilaEncadeada fila = new FilaEncadeada();
		Scanner scanner = new Scanner(System.in);
		int escolha;

		do {
			System.out.println("| ------------------------------------------------------------------------------------- |");
			System.out.println("| Insira a opção que deseja:                                                            |");
			System.out.println("| 1 - Enqueue ; 2 - Dequeue ; 3 - Size ; 4 - isEmpty ; 5 - Front ; 6 - Print ; 7 - Sair |");
			System.out.println("| ------------------------------------------------------------------------------------- |");

			escolha = scanner.nextInt();
			scanner.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("Insira o valor: ");
				fila.enqueue(scanner.nextLine());
				break;
			case 2:
				System.out.println("Elemento removido: " + fila.dequeue());
				break;
			case 3:
				System.out.println("Tamanho da Pilha: " + fila.size());
				break;
			case 4:
				System.out.println("A pilha está vazia? " + fila.isEmpty());
				break;
			case 5:
				System.out.println("Elemento do topo: " + fila.front());
				break;
			case 6:
				fila.showFila();
				break;
			case 7:
				System.out.println(" ");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (escolha != 7);
		scanner.close();
	}
}


