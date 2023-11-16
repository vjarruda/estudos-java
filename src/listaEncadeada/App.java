package listaEncadeada;

public class App {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.add(0, 10);
		lista.add(1, 5);
		lista.mostrarLista();
		
		lista.add(1, 3);
		lista.mostrarLista();;
		
		lista.remove(0);
		lista.mostrarLista();
	}
}
