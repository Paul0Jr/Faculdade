//Lê dois números e mostra a soma. Ante do resultado, deverá aparecer a mensagem: SOMA
#include <stdio.h>

int main(void){
    int n1, n2;
    printf("Digite o primeiro número: ");
    scanf("%d", &n1);
    printf("Digite o segundo número: ");
    scanf("%d", &n2);

    printf("\nSOMA\n%d + %d",n1,n2);
}