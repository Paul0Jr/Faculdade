//Lê um número e mostra a terça parte deste número.
#include <stdio.h>

int main(void){
    int n1;
    float tercparte;
    printf("Digite o número que deseja saber sua terça parte: ");
    scanf("%d", &n1);
    tercparte=n1/3;

    printf("A terça parte de %d = %.2f",n1, tercparte);
}