//Faça um programa que leia A, B e C e calcule a seguinte fórmula: (7*C+5*B) / (2*A*3), armazenando-a na variável Result.

#include <stdio.h>
#include <stdlib.h>

int main(){
    float a,b,c,Result;
    printf("Insira os valores de a, b e c, respectivamente: ");
    scanf("%f%f%f", &a,&b,&c);
    Result=(7*c+5*b)/(2*1*3);

    printf("Fórmula do Cálculo: (7*%.0f+5*%.0f) / (2*%.0f*3) = %.1f",c,b,a,Result);
    return 0;
}
