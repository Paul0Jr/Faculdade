/* Construa um programa que calcule a quantidade de latas de
tinta necessárias e o custo para pintar tanques cilíndricos de
combustível, onde são fornecidos a altura e o raio desse
cilindro.
Sabendo que:
- a lata de tinta custa R$20,00
- cada lata contém 5 litros
- cada litro de tinta pinta 3 metros quadrados.
Sabendo que:
Área do cilindro=3.14*raio2 + 2*3.14*raio*altura
e que raio e altura são dados de entrada. */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    const float lata = 20.00;
    float area_cilindro, metros_pintados, raio, altura;

    printf("Informe o tamanho do seu raio: ");
    scanf("%f", &raio);
    printf("Insira a altura do cilindro: ");
    scanf("%f", &altura);

    area_cilindro=(3.14*pow(raio,2)) + (2*3.14*raio*altura);
    metros_pintados=area_cilindro/3;
    printf("\nSerão gastos %.2f litros de tinta para pintar %.2f m2\n", metros_pintados, area_cilindro);
    printf("%.2f latas serão utilizadas para cobrir toda a área.\n", metros_pintados/5);
    printf("O total custará R$%.2f\n", (metros_pintados/5)*lata);

    return 0;
}