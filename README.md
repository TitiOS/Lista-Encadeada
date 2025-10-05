# Pilha Encadeada em Java

## Descrição
Este projeto implementa uma **TAD Pilha Encadeada** em Java.  
O programa lê uma sequência de números inteiros digitados pelo usuário, armazena-os em uma pilha e exibe os números na **ordem inversa** à digitada.

---

## Estrutura
O código é composto por três classes:
- **No**: representa um elemento da pilha (valor + referência para o próximo nó).
- **PilhaEncadeada**: implementa a estrutura de dados da pilha (push, pop, verificar se está vazia).
- **Main**: responsável por interagir com o usuário e exibir os resultados.

---

## Tipo de Pilha Escolhido: Encadeada

### Por que Pilha Encadeada?
A pilha **encadeada** foi escolhida porque:
- Não exige um tamanho fixo pré-definido (ao contrário da pilha baseada em array);
- É mais eficiente em termos de uso de memória para um número variável de elementos;
- As operações de inserção e remoção (`push` e `pop`) têm **complexidade O(1)**, pois são feitas apenas no topo.

---

## Execução do Programa

### Exemplo de entrada:

<img width="359" height="93" alt="image" src="https://github.com/user-attachments/assets/f73e7f2e-ac5c-488e-aa0d-89fad43d8bc9" />

### Saída esperada:

<img width="183" height="36" alt="image" src="https://github.com/user-attachments/assets/0d6ffa74-52a5-4f9c-858f-ec5e9053935f" />
