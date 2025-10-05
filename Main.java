/**
 * Aplicacao que utiliza uma TAD Pilha Encadeada.
 * 
 * Funcionalidades:
 * - Le uma sequencia de números inteiros digitados pelo usuario.
 * - Armazena os numeros em uma pilha encadeada.
 * - Exibe os numeros na ordem inversa a digitada.
 * 
 * Autor: Thiago de Oliveira Silva
 * RA: 10427342
 */


import java.util.Scanner;


// Classe principal: le os numeros, empilha e exibe na ordem inversa.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaEncadeada pilha = new PilhaEncadeada();

        System.out.println("Digite numeros inteiros (digite -1 para encerrar):");
        
        // Le numeros ate o usuario digitar -1.
        while (true) {
            int numero = scanner.nextInt();
            if (numero == -1) break;
            pilha.push(numero);
        }

        // Exibe os numeros na ordem inversa.
        System.out.println("\nNumeros na ordem inversa:");

        // Desempilha e imprime ate a pilha estar vazia.
        while (!pilha.estaVazia()) {
            System.out.print(pilha.pop() + " ");
        }

        scanner.close();
    }
}