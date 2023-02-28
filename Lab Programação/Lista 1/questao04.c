#include <stdio.h>
int main(){
    int numero = 0;
    puts("Escreva um número: ");
    scanf("%d", &numero);

    printf("O seu triplo é %d, o seu quadrado é %d e sua metade é %d!", numero*3, numero*2, numero/2);
    
    return  0;
    