//Faça um programa que leia cinco números inteiros, calcule e escreva a soma, o produto e a média dos números lidos.
#include <stdio.h>

int main(void){
    int n1, n2, n3, n4, n5;
    int soma, prod, media;
    printf("Insira 5 números inteiros aleatórios:\n");
    scanf("%d%d%d%d%d", &n1,&n2,&n3,&n4,&n5);
    soma=n1+n2+n3+n4+n5;
    prod=n1*n2*n3*n4*n5;
    media=n1+n2+n3+n4+n5/5;

    printf("\n%d + %d + %d + %d + %d = %d\n", n1,n2,n3,n4,n5,soma);
    printf("\n%d * %d * %d * %d * %d = %d\n",n1,n2,n3,n4,n5,prod);
    printf("\n%d + %d + %d + %d + %d / 5 = %d\n",n1,n2,n3,n4,n5,media);
}