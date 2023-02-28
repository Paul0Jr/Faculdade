#include <stdio.h>
int main(){
    float celsius, fahrenheit;
    printf("Insira a temperatura em Celsius que deseja converter: ");
    scanf("%f", &celsius);
    fahrenheit = (9*celsius +160)/5;

    printf("A temperatura de %.1f°C convertida par Fahrenheint é de %.2f!", celsius,fahrenheit);

    return 0;
    
}