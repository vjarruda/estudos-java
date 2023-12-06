package listaVetor;

public class ListaVetores {
    private int tamanho;
    private String[] vetor;

    public ListaVetores(int capacidade) {
        tamanho = 0;
        vetor = new String[capacidade];
    }

    public void add(int ind, String elem) {
        if (ind >= 0 && ind < vetor.length) {
            if (tamanho == vetor.length) {
                System.out.println("A lista está cheia. Não é possível adicionar mais elementos.");
                return;
            }
            //move elementos 
            if (vetor[ind] != null) {
                for (int i = tamanho; i > ind; i--) {
                    vetor[i] = vetor[i - 1];
                }
            }
            //adiciona na posicao
            vetor[ind] = elem;
            tamanho++;
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void remove(int ind) {
        if (ind >= 0 && ind < tamanho) {
        	//move elementos
            for (int i = ind; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            tamanho--;
            vetor[tamanho] = null;
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void getValor(int i) {
        if (i >= 0 && i < tamanho) {
            System.out.println("O valor do índice " + i + " é: " + vetor[i]);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void set(int ind, String novoValor) {
        if (ind >= 0 && ind < tamanho) {
            vetor[ind] = novoValor;
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void printLista() {
        System.out.println("Valores presentes na Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }
}
