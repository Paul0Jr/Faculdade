/* Faça um programa que leia uma string digitada pelo usuário (máximo 20 caracteres) e
imprima na tela o número de vogais existente nesta string. */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    int vogal = 0;
    char vetor[20], vogais[] = "aeiouAEIOU";

    printf("Insira uma frase: ");
    gets(vetor);
    for (int i = 0; vetor[i] != '\0'; i++)
    {
        for (int x = 0; vogais[x] != '\0'; i++)
            if (vogais[x] == vetor[i])
            {
                vogal++;
                break;
            }
    }
    printf("\nForam digitadas %d vogais\n", vogal);

    return 0;
}