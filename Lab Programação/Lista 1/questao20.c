#include <stdio.h>

int main(){
    int num;
    
    puts("Digite um número aleatório: ");
    scanf("%d",&num);

    printf("O número digitado é %s!", (num % 2 == 0) ? "par" : "ímpar");

    return 0;

}