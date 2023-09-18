/* Construa um programa que tendo como entrada dois pontos
quaisquer do plano P(x1,y1) e Q(x2,y2), imprima a distância
entre eles. A fórmula da distância é: sqrt=(x2-x1)^2 + (y2-y1)^2 */

#include <stdio.h>
#include <math.h>

int main()
{
    float distancia, x1, x2, y1, y2;
    printf("Informe os valores respectivos de x1, x2, y1 e y2: ");
    scanf("%f%f%f%f", &x1, &x2, &y1, &y2);

    distancia = sqrt(pow((x2-x1),2)+pow((y2-y1),2));

    printf("\nA distância total entre os pontos P1 e P2 é igual a %.2f\n", distancia);

    return 0;
}
