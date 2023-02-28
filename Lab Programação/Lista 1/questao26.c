#include <stdio.h>
#include <math.h>

int main(){
    float x1 = 0.0, y1 = 0.0, x2 = 0.0, y2= 0.0, distancia = 0.0;

    puts("Digite as coordenadas x e y do primeiro ponto: ");
    scanf("%f %f", &x1, &y1);

    puts("Digite as coordenadas x e y do segundo ponto: ");
    scanf("%f %f", &x2, &y2);

    distancia = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

    printf("A distância entre (%.2f, %.2f) e (%.2f, %.2f) é igual a %.2f!", x1, y1, x2, y2, distancia);

    return 0;
    
}