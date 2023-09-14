#include <stdlib.h>
#include <stdio.h>

int main(void){
    double n1=0.0;
    int mult=0;
    printf("Digite um número: ");
    scanf("%lf", &n1);
    mult=n1*1000;

    printf("O número %.2lf dividido por 3 é igual a %d", n1, mult%3);
}