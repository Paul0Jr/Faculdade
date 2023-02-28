#include <stdio.h>
int main(){
    float numero = 0;
    puts("Escreva um número: ");
    scanf("%f", &numero);

    printf("Seu número é equivalente ao inteiro %i!",(int)numero);
    
    return 0;

}