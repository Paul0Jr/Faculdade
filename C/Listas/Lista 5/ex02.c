/* Faça um programa que solicite ao usuário para digitar valores numéricos inteiros positivos.
Encerre a entrada de dados quando for digitado um número negativo ou zero. Calcule a média dos
números positivos digitados. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, i = 0, soma = 0;
    float media;
    for (i = 0; i < 5; i++)
    {
        printf("Digite o %d° número: ", i + 1);
        scanf("%d", &num);

        if (num <= 0)
        {
            break;
        }
        else
        {
            soma += num;
        }
    }
    media = soma / (float)i;
    printf("A média dos números digitados é igual a: %.2f", media);

    return 0;
}