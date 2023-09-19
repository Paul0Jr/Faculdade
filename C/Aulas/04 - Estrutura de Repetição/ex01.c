/* Escrever um algoritmo que lê 5 valores, e conta quantos
destes valores são negativos, escrevendo esta informação */
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numero, negativo=0;
    for(int cont=0; cont<5; cont++)
    {
        printf("\nInforme um valor: ");
        scanf("%d", &numero);

        if(numero<0)
{
            negativo++;
        }
    }
    printf("\nNo total foram digitados %d números negativos!\n", negativo);

    return 0;
}