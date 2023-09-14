//Leia o numerador e o denominador de uma fração e transforme-o em um número decimal.
#include <stdio.h>
#include <stdlib.h>

int main(){
    float num, denom;
    printf("Insira o valor do numerador: ");
    scanf("%f", &num);
    printf("Insira o valor do denominador: ");
    scanf("%f", &denom);

    printf("A sua fração é %.0f/%.0f",num, denom);
    printf("\nTransformando-a em decimal: %.2f", num/denom);
    return 0;
}