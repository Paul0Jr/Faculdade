/*Dados dois números A e B, some 100 ao maior número e
imprima. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int A,B;
    printf("Informe o valor de A: ");
    scanf("%d", &A);
    printf("Insira o valor de B: ");
    scanf("%d", &B);

    if(A>B)
    {
        A+=100;
        printf("\nO maior valor somado com 100 é igual a %d!\n", A);
    }
    else
    {
        B+=100;
        printf("\nO maior valor somado com 100 é igual a %d!\n", B);
    }
    
    return 0;
}