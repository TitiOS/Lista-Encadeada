# Pilha Encadeada em Java

## 🧩 Descrição
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
### Saída esperada: