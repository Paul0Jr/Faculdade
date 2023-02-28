#include <stdio.h>

int main(){
    int num = 0;
    puts("Digite um número decimal: ");
    scanf("%d", &num);

    printf("O número %d em hexadecimal é %X!\n", num, num);
    printf("O número %d em octal é %o!\n", num, num);
   
    return 0;
    
}