//Calcule e mostre a área de um triângulo (área é igual a (base x altura) dividido por 2)
#include <stdio.h>

int main(void){
    int base, altura;
    float area;
    printf("Digite a base de seu triângulo: ");
    scanf("%d", &base);
    printf("Insira a altura do seu triângulo: ");
    scanf("%d", &altura);
    area=(base*altura)/2;
    
    printf("A área do seu triângulo com base nos valores informados é igual a %.1fm²", area);
}