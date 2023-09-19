/* Armazenar 10 valores inteiros num vetor de 10 posições. Após, leia o vetor
e mostre os valores armazenados, adicionando em 10 unidades qdo forem
números positivos. */
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vetor[10];
    for (int cont = 0; cont < 10; cont++)
    {
        printf("Informe o %d valor: ", cont + 1);
        scanf("%d", &vetor[cont]);
    }
    for (int cont = 0; cont < 10; cont++)
    {
        if (vetor[cont] > 0)
        {
            printf("\nO valor armazenado na posição %d somado com 100 = %d\n", cont, vetor[cont]);
        }
        else
        {
            printf("\nO valor armazenado na posição %d = %d\n", cont, vetor[cont]);
        }
    }

    return 0;
}