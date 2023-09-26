/* Leia e armazene num vetor de 5 posições o nome dos alunos matriculados na disciplina de
Algoritmos I. Considere que a posição do vetor corresponde ao código do aluno.
A seguir, armazene em 3 vetores as notas N1, N2 e N3 obtidas por estes alunos na disciplina de
Algoritmos I, respectivamente. Considere que o índice do vetor corresponde ao código do aluno.
Sabendo que a média final de um aluno é definida como a média aritmética entre as 3 notas
obtidas, e que um aluno é aprovado se obtiver média igual ou superior a 6.0, mostre para cada
aluno:
- seu nome
- média final obtida
- “aprovado” ou “reprovado” */

#include <stdio.h>
#include <string.h>

int main()
{
    char lista[5][30];
    float n1[5], n2[5], n3[5], media[5];

    for (int i = 0; i < 5; i++)
    {
        printf("Informe o %d° nome: ", i + 1);
        scanf("%s", lista[i]);
        printf("Digite a primeira nota: ");
        scanf("%f", &n1[i]);
        printf("Insira a segunda nota: ");
        scanf("%f", &n2[i]);
        printf("Adicione a terceira nota: ");
        scanf("%f", &n3[i]);
        media[i] = (n1[i] + n2[i] + n3[i]) / 3;
        printf("\n");
    }

    for (int i = 0; i < 5; i++)
    {
        printf("O aluno(a) %s teve média = %.2f\n", lista[i], media[i]);
        if (media[i] >= 6.0)
        {
            printf("Aprovado(a)!\n");
        }
        else
        {
            printf("Reprovado(a)!\n");
        }
        printf("\n");
    }

    return 0;
}