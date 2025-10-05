/**
 * Classe que representa um no da pilha.
 * Cada no armazena um valor inteiro e uma referencia para o proximo no.
 */
class No {
    int valor;
    No proximo;

    // Construtor da classe No.
    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}