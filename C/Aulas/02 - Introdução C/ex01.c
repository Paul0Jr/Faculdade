/* Tendo como dados de entrada a altura e o sexo de uma
pessoa, construa um programa que calcule seu peso
ideal, utilizando a seguinte fórmula: peso ideal = (72.7*h) – 58 */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float altura, peso_ideal;
    char sexo;
    
    printf("Informe seu sexo: ");
    scanf("%s", &sexo);
    printf("\nInsira sua altura em metros: ");
    scanf("%f", &altura);

    peso_ideal=(72*altura) - 58;

    printf("\nDe acordo com a altura informada, o seu peso ideal seria de %.2f kg!\n", peso_ideal);

    return 0;
}