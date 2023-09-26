/* Leia e armazene num vetor de 10 posições o nome dos alunos aprovados no vestibular para
Ciência da Computação em 2007/1. A seguir, leia um nome de entrada e verifique se este
aluno consta na listagem dos aprovados e mostre sua classificação (ordem de aprovação,
representada pelo índice do vetor +1). Caso o nome informado não exista na lista dos
aprovados, mostre uma mensagem ‘Nome informado não consta na lista dos aprovados’. */

#include <stdio.h>
#include <string.h>

int main()
{
    int i = 0, x = 0;
    char nome[20], lista[10][20];

    for (i = 0; i < 10; i++)
    {
        printf("Informe o %d° nome: ", i + 1);
        gets(lista[i]);
    }

    /*for (i = 0; i < 10; i++)
    {
        printf("%s\n", lista[i]);
    }*/

    printf("\nInfome o nome qual deseja pesquisar: ");
    gets(nome);

    for (i = 0; i < 10; i++)
    {
        if (strcmp(nome, lista[i]) == 0)
        {
            printf("\nO aluno %s foi aprovado na %d° colocação!\n", nome, i + 1);
            x++;
        }
    }
    if (x == 0)
    {
        printf("\nO nome %s náo consta na lista de aprovados.\n", nome);
    }
    return 0;
}