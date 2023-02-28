#include <stdio.h>

int main(){
    int segundos = 0, minutos = 0, restantes = 0;
    puts("Digite uma quantidade de segundos aleatórios: ");
    scanf("%d", &segundos);

    restantes = segundos % 3600;
    minutos = restantes / 60;
    restantes = restantes % 60; 

    printf("%d equivalem a %d horas, %d minutos e %d segundos!", segundos, segundos / 3600, minutos, restantes);

    return 0;

}