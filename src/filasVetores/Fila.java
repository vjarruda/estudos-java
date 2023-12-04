package filasVetores;

public class Fila {
    private String[] valores;
    private int tamanho;
    private int capacidade;
    private int f; 
    private int r; 
    
    private int incrementarRear() {
        return (r + 1) % capacidade;
    }
    
    private int incrementarFront() {
        return (f + 1) % capacidade;
    }

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.valores = new String[capacidade];
        this.tamanho = 0;
        this.f = 0;
        this.r = -1;
    }

    public void enqueue(String valor) {
        if (tamanho < capacidade) {
            r = incrementarRear();
            valores[r] = valor;
            tamanho++;
        } else {
            System.out.println("A fila está cheia.");
        }
    }

    public String dequeue() {
        if (!isEmpty()) {
        	String valorRemovido = valores[f];
            f = incrementarFront();
            tamanho--;
            return valorRemovido;
        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public String front() {
        if (!isEmpty()) {
            return valores[f];
        } else {
            throw new IllegalStateException("Fila Vazia");
        }
    }

    public void showFila() {
        if (!isEmpty()) {
            System.out.println("Valores da fila: ");
            int i = f;
            int cont = 0;
            while(cont < tamanho) {
                System.out.println(valores[i]);
                i = incrementarFront();
                cont++;
            }
            System.out.println();
        } else {
            System.out.println("Fila Vazia");
        }
    }
}
