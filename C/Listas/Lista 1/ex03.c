//Lê um número e mostra seu sucessor e seu antecessor na tela.
#include <stdio.h>

int main(void){
    int num;
    printf("Digite um número: ");
    scanf("%d", &num);
    
    printf("\nVocê digitou o número %d", num);
    printf("O seu sucessor é %d e seu antecessor é %d", num+1, num-1);
}