package listas;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanho;
		
		System.out.println("Qual o tamanho da lista que você deseja? ");
		tamanho = scanner.nextInt();
		ListaVetores lista = new ListaVetores(tamanho);
		
		int escolha;
		do {
			System.out.println("| ---------------------------------------------------------------------------- |");
			System.out.println("| Insira a opção que deseja:                                                   |");
			System.out.println("| 1 - Add ; 2 - Remove ; 3 - Get ; 4 - Set ; 5 - Print ;  6 - Sair |");
			System.out.println("| ---------------------------------------------------------------------------- |");

			escolha = scanner.nextInt();
			scanner.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("Insira a posição: ");
				int posicao = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Insira o valor: ");
				lista.add(posicao, scanner.nextLine());
				break;
			case 2:
				System.out.println("Insira a posição do elemento que deseja remover: ");
				int remover = scanner.nextInt();
				lista.remove(remover);
				break;
			case 3:
				System.out.println("Insira a posição que deseja saber o valor: ");
				int valor = scanner.nextInt();
				lista.getValor(valor);
				break;
			case 4:
				System.out.println("Insira a posição");
				int index = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Insira o valor: ");
				lista.set(index, scanner.nextLine());
				break;
			case 5:
				lista.printLista();
				break;
			case 6:
				System.out.println(" ");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (escolha != 6);
		scanner.close();
	}

}

