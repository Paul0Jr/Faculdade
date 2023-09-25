/* Faca um programa q leia n valores reais. Armazene estes valores num vetor. Ao final, imprima a
média aritmética destes valores. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, n;
    do
    {
        printf("Insira a quantidade de valores que deseja armazenar: ");
        scanf("%d", &n);
    } while (n <= 0);
    float valores[n], soma = 0.0;
    printf("\n");

    for (i = 0; i < n; i++)
    {
        printf("Insira o %d° valor: ", i + 1);
        scanf("%f", &valores[i]);
        soma += valores[i];
    }

    printf("\nA média aritmética dos valores digitados é igual = %.2f\n", soma / n);

    return 0;
}