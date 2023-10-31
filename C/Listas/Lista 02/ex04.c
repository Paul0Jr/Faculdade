//Faça um programa que leia dois valores inteiros (X e Y) e calcule X na potência Y.
//Observação: utilizar a função matemática.
#include <stdio.h>
#include <math.h>

int main(){
    int x,y,potencia;
    printf("Digite, respectivamente, um valor para x e outro para y: ");
    scanf("%d%d",&x,&y);
    potencia=pow(x,y);
    printf("%d^^%d = %d",x,y,potencia);
    return 0;
}