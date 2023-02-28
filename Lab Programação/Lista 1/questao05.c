#include <stdio.h>
int main(){
    float conta = 0, taxa = 1/10.0;
    printf("Escreva o total da conta do cliente:R$ ");
    scanf("%f", &conta);

    printf("O total da conta com a taxa de 10%% de serviço será de R$%.2f.", conta+conta*taxa);
    
    return 0;

}