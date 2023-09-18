/* Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares.
Termine a leitura se o usuário digitar zero (0). */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float media;
    int soma, numero, positivo, cont=1;
    while (cont>0)
    {
        printf("Informe um valor: ");
        scanf("%d", &numero);
        if (numero!=0)
        {

            if (numero % 2 == 0)
            {
                numero=(float)numero;
                soma += numero;
                positivo++;
            }
        }
        else
        {
            break;
        }
        cont++;
    }

    positivo=(float)positivo;
    media=soma/positivo;
    printf("A média dos %d números pares digitados = %.2f", positivo, media);

    return 0;
}