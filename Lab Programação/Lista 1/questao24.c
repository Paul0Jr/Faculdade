#include <stdio.h>

int main(){
    int x = 0, n = 0;
    puts("Digite um valor para X: ");
    scanf("%d", &x);

    puts("Digire um valor para N: ");
    scanf("%d", &n);

    printf("O produto de %d e 2 elevado a %d é igual a %d!", x, n, x << n);
    return 0;
    
}