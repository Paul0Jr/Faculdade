#include <stdio.h>
int main(){
    int numero=0;
    puts("Escreva um número aleatório: ");
    scanf("%d", &numero);

    printf("o quadrado de %d é igual a %d", numero, numero*numero);
    
    return 0;
    
}