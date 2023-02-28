#include <stdio.h>

int main(){
    int num = 0;
    puts("Digite um número aleatório: ");
    scanf("%d", &num);
    int abs_num = (num >= 0) ? num : -num;
    printf("O valor absoluto de %d é %d\n!", num, abs_num);

    return 0;
    
}