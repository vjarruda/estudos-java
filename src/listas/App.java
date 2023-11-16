package listas;

public class App {
	public static void main(String[] args) {
		ListaVetores lista = new ListaVetores(5);
		
		lista.add(0, 10);
		lista.add(1, 5);
		lista.printLista();
		
		lista.add(1, 3);
		lista.printLista();
	}
}
