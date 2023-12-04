package pilhaEncadeada;

import java.util.Scanner;

public class MainPilhaEncadeada {
	public static void main(String[] args) {
		PilhaEncadeada pilha = new PilhaEncadeada();
		Scanner scanner = new Scanner(System.in);
		int escolha;

		do {
			System.out.println("| ---------------------------------------------------------------------------- |");
            System.out.println("| Insira a opção que deseja:                                                   |");
            System.out.println("| 1 - Push ; 2 - Pop ; 3 - Size ; 4 - isEmpty ; 5 - Top ; 6 - Print ; 7 - Sair |");
            System.out.println("| ---------------------------------------------------------------------------- |");
            
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Insira o valor: ");
                    pilha.push(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Elemento removido: " + pilha.pop());
                    break;
                case 3:
                    System.out.println("Tamanho da Pilha: " + pilha.size());
                    break;
                case 4:
                    System.out.println("A pilha está vazia? " + pilha.isEmpty());
                    break;
                case 5:
                    System.out.println("Elemento do topo: " + pilha.top());
                    break;
                case 6:
                    pilha.showPilha();
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