#include <stdio.h>

int main(){
    int num = 0, centenas = 0, dezenas = 0, unidades = 0;

    puts("Digite um numero de três digitos: ");
    scanf("%d", &num);

    unidades = num % 10;
    num = num / 10;
    dezenas = num % 10;
    num= num / 10;
    centenas = num % 10;

    num = unidades * 100 + dezenas * 10 + centenas;

    printf("O número solicitado na ordem inversa é %d!", num);

    return 0;
    
}