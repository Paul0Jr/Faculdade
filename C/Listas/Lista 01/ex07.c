//Leia 4 números e mostre a média ponderada, sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.
#include <stdio.h>

int main(void){
    int n1,n2,n3,n4;
    float mediapond, soma;
    printf("Digite o primeiro número: ");
    scanf("%d", &n1);
    printf("Digite o segundo número: ");
    scanf("%d", &n2);
    printf("Digite o terceiro número: ");
    scanf("%d", &n3);
    printf("Digite o quarto número: ");
    scanf("%d", &n4);

    soma= 1+2+3+4;
    mediapond = n1*1+n2*2+n3*3+n4*4;

    printf("A média ponderada entre %d,%d,%d e %d = %.2f",n1,n2,n3,n4,mediapond/soma);
}