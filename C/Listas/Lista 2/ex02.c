//Faça um programa que leia dois valores nas variáveis A e B respectivamente,
//troque o valor contido na variável A pelo valor em B, e o valor em B pelo valor em A,
//isto é, imprimiremos A e B com os valores trocados.
#include <stdio.h>

int main(void){
    int a, b, c;
    printf("Insira o valor de A: ");
    scanf("%d", &a);
    printf("Insira o valor de B: ");
    scanf("%d", &b);
    c=a;
    a=b;
    b=c;
    printf("a = %d\nb = %d", a, b);
}