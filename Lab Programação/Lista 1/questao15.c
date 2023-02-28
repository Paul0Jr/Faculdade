#include <stdio.h>

int main(){
    float liquido = 0.0;
    int dias = 0;

    puts("Digite a quantidade de dias trabalhados: ");
    scanf("%d", &dias);

    liquido = 50.25 * dias - (50.25 * dias * 0.1);

    if(dias<=10){
        printf("A quantidade de dias não lhe dá direito à gratificação. O total que receberá será de R$%.2f!", liquido);
    }
    else if(dias<=20){
        printf("Parabéns, você possui direito à gratificação. O total que receberá será de R$%.2f!", liquido + liquido * 0.20);
    }else{
        printf("Parabéns, você possui direito à gratificação. O total que receberá será de R$%.2f!", liquido + liquido * 0.30);
    }
    return 0;
    
    }