/* Faça um programa que calcule e escreva o valor de S: */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float num = 1.0, div = 1.0, s, somatorio=0.0;
    for (num = 1.0; num <= 99; num+=2)
    {
        s = (num / div);
        somatorio+=s;
        //num+=2;
        div++;
    }

    printf("\n%.2f\n", somatorio);
    return 0;
}