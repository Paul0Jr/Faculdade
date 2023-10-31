/* Leia 3 valores inteiros (X, Y, Z), determina e escreve o menor deles. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x, y, z;
    printf("Informe os valores respectivos de x, y e z: ");
    scanf("%d%d%d", &x, &y, &z);

    if(x<y && x<z)
    {
        printf("\nO valor %d é o menor valor dos três digitados\n", x);
    }
    else if(y<x && y<z)
    {
        printf("\nO valor %d é o menor valor dos três digitados\n", y);
    }
    else if(z<x && z<y)
    {
        printf("\nO valor %d é o menor valor dos três digitados\n", z);
    }

    return 0;
}