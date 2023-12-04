package pilhaEncadeada;

public class PilhaEncadeada {
    private No topo;
    private int tamanho;

    public PilhaEncadeada() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(String valor) {
        No novo = new No(valor);
        if (isEmpty()) {
            topo = novo;
        } else {
            novo.anterior = topo;
            topo = novo;
        }
        tamanho++;
    }

    public String pop() {
        if (!isEmpty()) {
            String valor = topo.valor;
            topo = topo.anterior;
            tamanho--;
            return valor;
        } else {
            System.out.println("Pilha Vazia");
            return null;
        }
    }

    public String top() {
        if (!isEmpty()) {
            return topo.valor;
        } else {
            throw new IllegalStateException("Pilha Vazia");
        }
    }

    public void showPilha() {
        System.out.println("Valores na pilha: ");
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.anterior;
        }
        if (isEmpty()) {
            System.out.println("Pilha Vazia");
        }
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }
}

