/* Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos,
lidos externamente. O final da leitura acontecerá quando for lido um valor negativo. */

#include <stdio.h>
#include <stdlib.h>

int main()
{   
    float numero, soma;
    int cont=0;

    while (cont>=0)
    {
        printf("Informe um valor inteiro(digite um negativo para sair): ");
        scanf("%f", &numero);
        if(numero<0)
        {
            break;
        }
        else
        {
            soma+=numero;
        }
        cont++;
    }
    printf("A média dos valores digitado é igual a %.2f", soma/cont);

    return 0;
}