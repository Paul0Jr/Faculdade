/* Escreva um algoritmo para determinar se uma pessoa é
maior ou menor de idade. */
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int idade;
    printf("Informe sua idade: ");
    scanf("%d", &idade);

    if(idade<18)
    {
        printf("\nVocê não é maior de idade!\n");
    }
    else
    {
        printf("\nParabéns, você é maior de idade!\n");
    }

    return 0;
}