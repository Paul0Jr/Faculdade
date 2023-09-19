/* Faca um programa q armazene em um vetor de inteiros as quantidades compradas de 5 produtos.
Em outro vetor de reais, armazene o valor unitário de cada produto.
O programa deve, ao final, mostrar o valor total a ser pago por cada produto.
Considere q o índice do vetor corresponde ao código do produto */
#include <stdio.h>
#include <stdlib.h>

int main()
{
    float valor_unitario[5], qtd[5];
    float valor_produto, valor_total = 0;
    for (int i = 0; i < 5; i++)
    {
        printf("\nInforme a quantidade comprada do %d produto: ", i + 1);
        scanf("%f", &qtd[i]);
        printf("Insira o valor unitário do produto de índice %d: ", i + 1);
        scanf("%f", &valor_unitario[i]);
    }
    for (int i = 0; i < 5; i++)
    {
        valor_produto = qtd[i] * valor_unitario[i];
        valor_total += valor_produto;
        printf("\nO valor total do produto de índice %d = R$%.2f\n", i, valor_total);
    }
    printf("\nAo final o total a ser pago será R$%.2f\n", valor_total);
    return 0;
}