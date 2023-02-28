#include <stdio.h>
int main(){
    float comprimento = 0.0, altura =0.0, largura = 0.0;
    puts("Escreva respectivamente o comprimento, altura e largura de sua caixa: ");
    scanf("%f %f %f", &comprimento, &altura, &largura);

    printf("O volume de sua caixa será igual a %.2f cm³.", comprimento*altura*largura);
    
    return 0;
    
}