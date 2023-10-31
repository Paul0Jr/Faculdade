//Lê dois números e mostre os seguintes resultados:
//a. Dividendo:
//b. Divisor:
//c. Quociente:
//d. Resto (para calcular o resto de uma divisão, utilize o operador MOD (em C: %)
#include <stdio.h>

int main(void){
    int n1, n2;
    printf("Digite o primeiro número: ");
    scanf("%d", &n1);
    printf("Digite o segundo número: ");
    scanf("%d", &n2);

        printf("\nDividendo = %d", n1);
        printf("\nDivisor = %d", n2);
        printf("\nQuociente = %d", n1/n2);
        printf("\nResto = %d", n1%n2);
}