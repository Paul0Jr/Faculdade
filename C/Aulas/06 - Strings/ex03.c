/* Faca um programa que leia o nome de 5 pessoas e mostre os nomes armazenados.
Utilize vetores. */
#include <stdio.h>
#include <stdlib.h>

int main()
{
    char nomes[5][30];

    for (int i = 0; i < 5; i++)
    {
        printf("\nEscreva o %d° nome: ", i + 1);
        gets(nomes[i]);
    }

    for (int i = 0; i < 5; i++)
    {
        printf("\nO %d° nome armazenado foi %s\n", i + 1, nomes[i]);
    }

    return 0;
}