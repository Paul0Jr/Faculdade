#include <stdio.h>
int main(){
    int x, a, b;
    puts("Escreva respectivamente um valor para A e outro para B: ");
    scanf("%d %d", &a, &b);
    x=a;
    a=b;
    b=x;
    printf("O novo valor de A é %d e o novo valor de B é %d.", a, b);

    return 0;
    
}