//Entre com a base e a altura de um retângulo e mostre os resultados:
//a. Perímetro (Perímetro é igual à soma dos 4 lados)
//b. Área (Área é igual à lado vezes lado)
#include <stdio.h>

int main(void){
    int base, altura;
    printf("Insira a base do seu retângulo: ");
    scanf("%d", &base);
    printf("Insira a altura do seu retângulo: ");
    scanf("%d", &altura);

    printf("\nCom nos valores informados, o perímetro do seu retângulo possui um perímetro de %dm", base*2+altura*2);
    printf("\nA área do seu retângulo será de %dm²", base*altura);
}