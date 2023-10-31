/* Armazene num vetor de 5 posições o salário de 5 pessoas. Se o salário for menor q 1000 reais,
forneça um aumento de 10% e sobrescreva o valor antigo. Ao final, mostre a lista de salários
atualizada. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float vetor[5];

    for (int i = 0; i < 5; i++)
    {
        printf("Insira o %d° salário: ", i + 1);
        scanf("%f", &vetor[i]);
        if (vetor[i] < 1000)
        {
            vetor[i] *= 1.1;
        }
    }

    printf("\nA lista dos salários: ");
    for (int i = 0; i < 5; i++)
    {
        printf("%.2f; ", vetor[i]);
        if (i == 4)
        {
            printf("%.2f", vetor[i]);
        }
    }

    printf("\n");
    return 0;
}