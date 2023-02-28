#include <stdio.h>

int main(){
    int numero1 = 0, numero2 = 0;
    
    puts("Digite dois números aleatórios: ");
    scanf(" %d %d", &numero1, &numero2);

    printf("O número %d %s de %d!", numero1, (numero1 % numero2 == 0) ? "é múltiplo" : "não é múltiplo", numero2);

    return 0;
    
}