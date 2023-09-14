#include <stdio.h>
#include <stdlib.h>

int main(void){
    double n1=0.0;
    int mult=0;
    printf("Digite um número real: ");
    scanf("%lf", &n1);
    mult=1000*n1;
    printf("O número %2.lf dividido por 3 resulta em resto %d", n1, mult%3);
}