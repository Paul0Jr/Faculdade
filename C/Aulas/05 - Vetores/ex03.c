/* Faca um algoritmo q leia 5 idades de 5 pessoas e escreva o numero de
pessoas que são maiores de idade. Armazene as idades num vetor. */
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vetor[5], cont=0;
    for(int i=0; i<5; i++)
    {
        printf("Insira a %d idade: ", i+1);
        scanf("%d", &vetor[i]);
        if(vetor[i]>=18)
        {
            cont++;
        }
    }
        if(cont==5)
        {
        printf("\nTodas as pessoas são maiores de idade!\n");
        }
        else
        {
            printf("\nApenas %d são maiores de idade!\n", cont);
        }
    return 0;
}