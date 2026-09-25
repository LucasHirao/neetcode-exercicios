# Contains Duplicate

Dado um array de inteiros `nums`, retornar `true` se algum valor aparece **pelo menos duas vezes** no array, e `false` se todos os elementos forem distintos.

Link: https://neetcode.io/problems/duplicate-integer

## Abordagem

Percorrer o array guardando os valores já vistos em um `HashSet`. Ao tentar inserir um número que já está no conjunto, sabemos que há duplicata.

## Complexidade

- Tempo: O(n)
- Espaço: O(n)
