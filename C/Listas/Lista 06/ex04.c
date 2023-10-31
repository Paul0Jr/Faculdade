/* Faca um programa q pergunte ao usuário o numero de alunos a ser lido. O tamanho dos vetores
será o numero informado pelo usuário. Armazene num vetor as notas G1 destes alunos; num
outro vetor, armazene as notas G2 destes alunos. Ambas notas, G1 e G2, são informadas pelo
usuário. Calcule a media aritmética destes alunos e armazene num terceiro vetor. Ao final, mostre
as 3 notas dos alunos. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, alunos;

    printf("Insira a quantidade de alunos a ser lidos: ");
    scanf("%d", &alunos);
    float G1[alunos], G2[alunos], media[alunos];

    for (i = 0; i < alunos; i++)
    {
        printf("\n");
        printf("Informe a nota G1 do %d° aluno: ", i + 1);
        scanf("%f", &G1[i]);
        printf("Informe a nota G2 do %d° aluno: ", i + 1);
        scanf("%f", &G2[i]);
        media[i] = (G1[i] + G2[i]) / 2;
    }
    printf("\n");
    for (i = 0; i < alunos; i++)
    {
        printf("A primeira nota do %d° aluno: %.2f\n", i + 1, G1[i]);
        printf("A segunda nota do %d° aluno: %.2f\n", i + 1, G2[i]);
        printf("A média do %d° aluno: %.2f\n", i + 1, media[i]);
        printf("\n");
    }

    return 0;
}