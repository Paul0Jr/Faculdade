/*  Desenvolva um algoritmo que efetue a leitura de três valores para os lados de um triângulo,
considerando lados como: A, B e C. O algoritmo deverá verificar se os lados fornecidos forma
realmente um triângulo (cada lado é menor que a soma dos outros dois lados). Se for esta condição
verdadeira, deverá ser indicado qual tipo de triângulo foi formado: isósceles (dois lados iguais e um
diferente), escaleno (todos os lados diferentes) ou eqüilátero (todos os lados são iguais). */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b, c;
    printf("Informe os 3 lados do seu triângulo:\n");
    scanf("%d%d%d", &a, &b, &c);

    if (a <= b + c && b <= a + c && c <= a + b)
    {
        if (a != b && a != c && b != c)
        {
            printf("\nO triângulo formado foi um escaleno!\n");
        }
        else if (a == b && a == c)
        {
            printf("\nO triângulo formado foi um equilátero!\n");
        }
        else
        {
            printf("\nO triângulo formado foi um isósceles!\n");
        }
    }
    else
    {
        printf("\nOs valores %d, %d e %d não podem formar um triângulo!\n", a, b, c);
    }

    return 0;
}