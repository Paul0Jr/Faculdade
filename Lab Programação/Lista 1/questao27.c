#include <stdio.h>
#include <math.h>

int main(){
    float numero1 = 0, numero2 = 0, numero3 = 0;

    puts("Digite o primeiro número: ");
    scanf("%f", &numero1);

    puts("Digite o segundo número: ");
    scanf("%f", &numero2);

    puts("Digite o terceiro número: ");
    scanf("%f", &numero3);

    printf("A media aritmetica eh: %.2f\n", (numero1 + numero2 + numero3) / 3);
    printf("A media geometrica eh: %.2f\n", pow(numero1 * numero2 * numero3, 1.0/3));

    return 0;
    
}