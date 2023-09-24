/* Em uma pesquisa de campo, uma editora solicitou os seguintes dados para os entrevistados:
sexo, idade e quantidade de livros que leu no ano de 2006. Faça um programa que leia os
dados digitados pelo usuário, sendo que deverão ser solicitados dados até que a idade digitada
seja um valor negativo.

Depois, calcule e imprima:
a) A quantidade total de livros lidos pelos entrevistados menores de 10 anos.
b) A quantidade de mulheres que leram 5 livros ou mais.
c) A média de idade dos homens que leram menos que 5 livros.
d) O percentual de pessoas que não leram livros. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int sexo,total=0, idade, nao_lidos = 0, soma_homens = 0, livros, homens_menor=0, mulheres_maior = 0, total_mulheres = 0, total_homens = 0, livros_menores = 0;
    float media;

    do
    {
        printf("\nInforme seu sexo: [1] Masculino  [2]Feminino\nSua escolha: ");
        scanf("%d", &sexo);
        if(sexo==1 || sexo==2)
        {
            printf("Digite sua idade: ");
            scanf("%d", &idade);
            printf("Digite a quantidade livros lidos no ano de 2006: ");
            scanf("%d", &livros);

            //O percentual de pessoas que não leram livros.
            if (livros == 0)
            {
                nao_lidos++;
            }

        //A quantidade total de livros lidos pelos entrevistados menores de 10 anos.
            if (idade < 10)
            {
                livros_menores += livros;
            }

        //Se for do sexo feminino.
            if (sexo == 2)
            {
                total_mulheres++;

                //A quantidade de mulheres que leram 5 livros ou mais.
                if (livros >= 5)
                {
                    mulheres_maior++;
                }
            }

            //Se for do sexo masculino.
            else if (sexo == 1)
            {
                total_homens++;

                //A média de idade dos homens que leram menos que 5 livros.
                if (livros < 5)
                {
                    soma_homens += idade;
                    homens_menor++;
                }
            }
        }
        else
        {
            printf("\nSexo inválido!");
        }
        total++;

    } while (idade > 0);

    media=soma_homens/(float) homens_menor;

    printf("\nUm total de %d pessoas participaram da entrevista, sendo %d homens e %d mulheres", total, total_homens, total_mulheres);
    printf("\nA quantidade total de livros lidos pelos entrevistados menores de 10 anos = %d", livros_menores);
    printf("\nA quantidade de mulheres que leram 5 livros ou mais = %d", mulheres_maior);
    printf("\nA média de idade dos homens que leram menos que 5 livros = %.2f", media);
    //printf("\nO percentual de pessoas que não leram livros = ");

    return 0;
}