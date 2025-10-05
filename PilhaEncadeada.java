/**
 * Classe que representa a pilha encadeada.
 * Implementa as operações básicas de uma pilha:
 * push(empilhar), pop(desempilhar) e verificacao se esta vazia.
 */
class PilhaEncadeada {
    private No topo;

    // Construtor: inicializa uma pilha vazia.
    public PilhaEncadeada() {
        this.topo = null;
    }

    // Empilha um novo valor no topo da pilha.
    public void push(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    // Desempilha o valor do topo da pilha e o retorna.
    public int pop() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha ests vazia");
        }
        int valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }
    
    // Verifica se a pilha esta vazia.
    public boolean estaVazia() {
        return topo == null;
    }
}