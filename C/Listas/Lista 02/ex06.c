//6) Faça um programa que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
#include <stdio.h>

int main(){
    int dias, anos,meses,dias_rest;
    printf("Informe a quantidade de dias vividos: ");
    scanf("%d",&dias);
    anos=dias/365;
    meses=(dias%365)/30;
    dias_rest=(dias%365)%30;
    printf("A quantidade de %d será expressa da seguinte forma: ",dias);
    printf("Anos = %d\nMeses = %d\nDias = %d",anos,meses,dias_rest);
    return 0;
}