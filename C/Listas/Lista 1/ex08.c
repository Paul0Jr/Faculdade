//Lê o saldo de uma aplicação e imprima o novo saldo, considerado o reajuste de 1%.
#include <stdio.h>

int main(void){
    float saldo;
    printf("Digite o valor do saldo: ");
    scanf("%f", &saldo);
    
    printf("\nSaldo inserido: R$%.1f", saldo);
    printf("\nO novo saldo considerando um reajuste de 1%% passará a ser R$%.1f", saldo+(saldo*0.01));
}