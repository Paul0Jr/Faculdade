#include <stdio.h>
int main(){
    float dolar = 0.0, real= 0.0;
    puts("Escreva respectivamente a cotação do dólar atual e o total de reais que deseja converter para a moeda estadunidense: ");
    scanf("%f %f", &dolar, &real);

    printf("O total de R$%.2f convetido para dólar será de $%.2f!", real, dolar*real);

    return 0;
    
}