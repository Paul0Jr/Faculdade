/* Escrever um algoritmo que lê 5 valores, e conta quantos
destes valores são negativos, escrevendo esta
informação. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int contador=0, numero, negativo=0;
    while (contador<5)
    {
        printf("\nInsira um valor: ");
        scanf("%d", &numero);
        if(numero<0)
        {
            negativo++;
        }
        contador++;
    }
    printf("\nUm total de %d números negativos foram digitados!\n", negativo);

    return 0;
}