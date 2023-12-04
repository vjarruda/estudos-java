package pilhasVetores;

public class Pilha {
    private String[] valores;
    private int tamanho;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.valores = new String[capacidade];
        this.tamanho = 0;
    }

    public void push(String valor) {
        if (tamanho < capacidade) {
            valores[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("A pilha está cheia.");
        }
    }

    public String pop() {
        if (tamanho > 0) {
            tamanho--;
            String valorRemovido = valores[tamanho];
            valores[tamanho] = null; // Limpa o valor removido
            return valorRemovido;
        } else {
            System.out.println("Pilha Vazia");
            return null;
        }
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public String top() {
        if (!isEmpty()) {
            return valores[tamanho - 1];
        } else {
            return "Pilha Vazia";
        }
    }

    public void showPilha() {
        if (!isEmpty()) {
            System.out.println("Valores da pilha: ");
            for (int i = tamanho - 1; i >= 0; i--) {
                System.out.println(valores[i]);
            }
            System.out.println(" ");
        } else {
            System.out.println("Pilha Vazia");
        }
    }
}

