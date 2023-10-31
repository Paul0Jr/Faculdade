/* Faça um algoritmo que leia 10 salários. Depois de lidos e armazenados, mostre o maior valor.
Utilize vetores. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float vetor[10], maior_salario;
    // float salario;

    for (int i = 0; i < 10; i++)
    {
        printf("Insira o %d° salário: ", i + 1);
        scanf("%f", &vetor[i]);
        // printf("%.2f\n", vetor[i]);
        if (i == 0)
        {
            maior_salario = vetor[i];
        }
        else
        {
            if (vetor[i] > maior_salario)
            {
                maior_salario = vetor[i];
            }
        }
    }

    printf("\nA lista dos salários digitados: ");
    for (int i = 0; i < 10; i++)
    {
        printf("%.2f; ", vetor[i]);
    }

    printf("\nO maior salário é de R$%.2f\n", maior_salario);
    return 0;
}