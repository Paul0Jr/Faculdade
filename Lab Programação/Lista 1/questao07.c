#include <stdio.h>
int main(){
    int horas, minutos, segundos;

    puts("Escreva o total de horas, minutos e segundos que deseja converter para segundos no formato H|M|S: ");
    scanf("%d %d %d", &horas, &minutos, &segundos);

    printf("O total digitado convertido será de %d segundos", horas*60 *60 + minutos *60 + segundos);
    
    return 0; 

}