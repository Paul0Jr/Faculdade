//Lê o raio de um círculo e mostre como saída o perímetro (2*π*Raio) e a área (π*Raio2).
#include <stdio.h>

int main(void){
    int raio;
    const float PI=3.14;
    printf("Informe o valor do raio do círculo: ");
    scanf("%d", &raio);

    printf("\nConforme o valor inserido, o perímetro do círculo equivale a %.1fm", 2*PI*raio);
    printf("\nA área do seu círculo será de %.1fm²", PI*(raio*raio));
}