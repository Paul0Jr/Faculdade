#include <stdio.h>
int main(){
    int num1, num2;
    puts("Insira dois números aleatórios: ");
    scanf("%d %d", &num1, &num2);

    printf("A soma destes números será %d!\n", num1+num2);
    printf("O produto será %d!\n", num1*num2);
    printf("A diferença será %d!\n", num1-num2);
    printf("O quociente será %d!\n", num1/num2);
    printf("O resto da divisão será %d!\n", num1 % num2);

    return 0;
    
}

