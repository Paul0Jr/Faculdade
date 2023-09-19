/* Armazenar 10 valores inteiros num vetor de 10 posições e
mostrar os valores armazenados */
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vetor[10];
    for(int cont=0;cont<10;cont++)
    {
        printf("\nInforme o %d valor: ", cont+1);
        scanf("%d", &vetor[cont]);
    }
    for(int cont=0; cont<10;cont++)
    {
        printf("\nO valor armazenado na posição %d = %d\n", cont+1, vetor[cont]);
    }

    return 0;
}