#include <stdio.h>
int main(){
    float raio=0.0, pi= 3.14159;
    puts("Digite o valor do raio do círculo: ");
    scanf("%f", &raio);

    printf("O seu diâmetro é de: %.2fcm\nO valor de sua circunferência é de: %.2fcm\nA sua área é de: %.2fcm²\n", raio*2, 2*raio*pi, pi*raio*raio);
    
    return 0;

}