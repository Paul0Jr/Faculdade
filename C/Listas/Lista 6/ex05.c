/* Faca um algoritmo q leia e armazene 5 valores inteiros em um vetor Vet1. Leia outros 5 valores
inteiros e armazene num vetor Vet2. A partir destes valores lidos, mostre na tela:
- a soma dos elementos de cada vetor, nas respectivas posições
- a diferença dos elementos de cada vetor, nas respectivas posições
- o produto dos elementos de cada vetor, nas respectivas posições
- a divisão entre os elementos de cada vetor, nas respectivas posições */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, vet1[5], vet2[5];

    for(i=0; i<5; i++)
    {
        printf("Insira o %d° valor do primeiro vetor: ", i+1);
        scanf("%d", &vet1[i]);
        printf("Insira o %d° valor do segundo vetor: ", i+1);
        scanf("%d", &vet2[i]);
        printf("\n");
    }
    printf("==============================================================\n\n");
    for(i=0; i<5; i++)
    {
        printf("A soma de %d + %d = %d\n", vet1[i], vet2[i], vet1[i]+vet2[i]);
        printf("A diferença de %d - %d = %d\n", vet1[i], vet2[i], vet1[i]-vet2[i]);
        printf("O produto de %d * %d = %d\n", vet1[i], vet2[i], vet1[i]*vet2[i]);
        printf("A divisão de %d / %d = %.3f\n", vet1[i], vet2[i], vet1[i]/(float) vet2[i]);
        printf("\n");
    }

    return 0;
}