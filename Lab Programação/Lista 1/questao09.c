#include <stdio.h>
int main(){
    int num=0;
    
    puts("Insira um valor para ser determinado seu sucessor e antecessor: ");
    scanf("%d", &num);

    printf("Seu sucessor é %d.\nSeu antecessor é %d.", num+1, num-1);

    return 0;
}