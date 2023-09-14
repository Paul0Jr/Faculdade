//Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
#include <stdio.h>

int main(){
    int  idadetotal, anos, meses, dias;
    printf("Insira, respectivamente, o total de anos, meses e dias de vida:\n");
    scanf("%d%d%d", &anos, &meses, &dias);
    idadetotal=((anos*12)+meses)*30+dias;
    printf("Você viveu cerca de %d dias!", idadetotal);
    return 0;
}