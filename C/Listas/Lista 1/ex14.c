//Lê um valor de hora e informa quantos minutos se passaram desde o início do dia.
#include <stdio.h>

int main(){
    int hora;
    printf("Insira o valor da hora: ");
    scanf("%d", &hora);
    
    printf("Conforme o valor de %d horas inserido, o total de minutos que se passaram desde o início do dia será de %d minutos!", hora, hora*60);
    return 0;
}