/* Foi feita uma pesquisa para saber o perfil dos alunos que cursam o ginásio de uma determinada
escola. Cada aluno fornecia a sua série (primeira-1, segunda-2, terceira-3 ou quarta-4), quantos
livros liam por mês e se gostavam de fazer redação (Sim-1 ou Não-0). Fazer um programa que
leia os dados, calcule e imprima:
 A quantidade de alunos que está na terceira série;
 A maior quantidade de livros lidos por um aluno que está na quarta série;
 A porcentagem de alunos que não gostam de fazer redação e que estão na terceira série.

OBS: A condição de parada (flag) é que seja digitado 0 (zero) para idade. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int idade, serie, maior_qtd = 0, qtd_livros, total = 0, total_terceira = 0, redacao_negacao = 0, redacao = 0;
    float porcentagem;

    while (1 == 1)
    {
        printf("\nDigite sua idade: ");
        scanf("%d", &idade);
        if (idade == 0)
        {
            break;
        }

        // SÉRIE
        do
        {
            printf("\nInforme sua série: [1] Primeira   [2] Segunda   [3] Terceira   [4] Quarta\nSua escolha: ");
            scanf("%d", &serie);
        } while (serie <= 0 || serie >= 5);

        // lIVROS
        do
        {
            printf("\nInsira a quantidades de livros foram lidos este mês: ");
            scanf("%d", &qtd_livros);
        } while (qtd_livros < 0);

        // REDAÇÃO
        do
        {
            printf("Você gosta de fazer redação? [1] Sim   [2] Não\nSua escolha: ");
            scanf("%d", &redacao);
        } while (redacao <= 0 || redacao >= 3);

        total++;

        // A quantidade de alunos que está na terceira série
        if (serie == 3)
        {
            total_terceira++;
            if (redacao == 2)
            {
                redacao_negacao++;
            }
        }

        // A maior quantidade de livros lidos por um aluno que está na quarta série
        if (serie == 4)
        {
            if (total == 1)
            {
                maior_qtd = qtd_livros;
            }
            else
            {
                if (qtd_livros > maior_qtd)
                {
                    maior_qtd = qtd_livros;
                }
            }
        }
    }

    porcentagem = (redacao_negacao / total) * 100;
    printf("\nA quantidade de alunos que está na terceira série = %d alunos", total_terceira);
    printf("\nA maior quantidade de livros lidos por um aluno que está na quarta série = %d livros", maior_qtd);
    printf("\nA porcentagem de alunos que não gostam de fazer redação e que estão na terceira série é igual a %.0f%% de %d\n", porcentagem, total);

    return 0;
}