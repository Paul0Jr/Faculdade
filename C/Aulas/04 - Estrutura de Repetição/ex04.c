/* Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe.
O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o código for igual a zero. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int codigo_aluno, cont=0;
    float notas, soma;
    while (cont>=0)
    {
        printf("\nInforme o código do aluno: ");
        scanf("%d", &codigo_aluno);
        if(codigo_aluno==0)
        {
            break;
        }
        for(int i=0; i<3; i++)
        {
            printf("\nInforme a %d nota: ", i+1);
            scanf("%f", &notas);
            soma+=notas;
        }
        printf("\nA média do aluno de código %d: %.2f\n", codigo_aluno, soma/3);
        cont++;
    }

    return 0;
}