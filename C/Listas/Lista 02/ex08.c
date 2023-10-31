//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um programa em C que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

#include <stdio.h>
int main(){
    float perc_distribuidor,imposto,custo;
    printf("Informe o custo de fábrica do veículo:");
    scanf("%f", &custo);

    perc_distribuidor=0.28*custo;
    imposto=0.45*custo;

    printf("O valor final do veículo será de R$%.2f",custo+perc_distribuidor+imposto);
    return 0;
}