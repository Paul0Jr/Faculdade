//Mostrar a média aritmética entre 3 números passados pelo usuário.
#include <stdio.h>

int main(void){
    float n1, n2, n3;
    printf("Digite a primeira nota do aluno: ");
    scanf("%f", &n1);
    printf("Digite a segunda nota do aluno: ");
    scanf("%f", &n2);
    printf("Digite a terceira nota do aluno: ");
    scanf("%f", &n3);

    printf("A média aritmética do aluno será igual a %.1f", (n1+n2+n3)/3);
}
