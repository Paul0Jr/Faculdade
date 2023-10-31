//Faça um programa que leia as variáveis y e z. Após, calcule e mostre o valor de x, dado pela expressão: x =  y*(y^22 + z^33)
#include <stdio.h>
#include <math.h>

int main(){
    float x,y,z,interno,poty,potz;
    printf("Informe, respectivamente, um valor para y e para z: ");
    scanf("%f%f", &y,&z);
    poty=pow(y,22);
    potz=pow(z,33);
    interno=poty+potz;
    x=sqrt(interno);
    
    printf("A raiz quadrada de %.0f será: %.0f",interno, x);
    return 0;
}