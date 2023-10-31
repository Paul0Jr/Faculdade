//Calcule o valor de uma prestação em atraso, utilizando a fórmula: PRESTAÇÃO = VALOR + (VALOR * (TAXA/100) * TEMPO).
#include <stdio.h>
#include <stdlib.h>

int main(){
    int valor, taxa, tempo, prest;
    printf("Por favor, insira o valor da sua prestaçâo em atraso: R$");
    scanf("%d", &valor);
    printf("Agora, insira a taxa da prestação: ");
    scanf("%d", &taxa);
    printf("Insira em quantos meses a prestação será paga: ");
    scanf("%d", &tempo);
    prest=valor+(valor*taxa/100*tempo);

    printf("De acordo com os valores informados sua prestação sairá no total de R$%d", prest);
    return 0;
}