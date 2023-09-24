/* Foi realizada uma pesquisa com 200 pessoas que assistiram uma peça de teatro, em relação a
sua opinião sobre a mesma. Cada espectador respondeu a um questionário que solicitava os
seguintes dados:
 idade da pessoa;
 o identificador da pessoa;
 opinião em relação à peça(de 0 a 10).

Faça um programa que, a partir destes dados, calcule e imprima:
a.A quantidade de respostas 10.
b.A média de idade das pessoas que responderam o questionário.
c.A percentagem de pessoas que responderam 5 ou menos para a opinião da peça.
d.O identificador da pessoa mais velha.
* Considere que a maior idade não é repetida. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int mais_velho, identificador, idade, soma_idade = 0, total10 = 0, nota = 0, porcentagem = 0, idade_velho = 0;
    float media;

    for (int i = 0; i < 10; i++)
    {
        printf("\nDigite seu identificador: ");
        scanf("%d", &identificador);
        do
        {
            printf("Insira sua idade: ");
            scanf("%d", &idade);
        } while (idade < 0);
        soma_idade += idade;

        // O identificador da pessoa mais velha
        if (i == 0)
        {
            mais_velho = identificador;
            idade_velho = idade;
        }
        else
        {
            if (idade > idade_velho)
            {
                mais_velho = identificador;
                idade_velho = idade;
            }
        }

        do
        {
            printf("Qual sua nota em relação à peça: ");
            scanf("%d", &nota);
        } while (nota > 10 || nota < 0);

        // A quantidade de respostas 10
        if (nota == 10)
        {
            total10++;
        }

        // A percentagem de pessoas que responderam 5 ou menos para a opinião da peça
        else if (nota <= 5)
        {
            porcentagem++;
        }
    }
    media = (float)soma_idade / 10;

    printf("\nA quantidade total de respostas 10 = %d", total10);
    printf("\nA média de idade das pessoas que responderam o questionário = %.2f", media);
    printf("\nA percentagem de pessoas que responderam 5 ou menos para a opinião da peça = %d", porcentagem);
    printf("\nO identificador da pessoa mais velha é %d e possui %d\n", mais_velho, idade_velho);

    return 0;
}

/* Obs: O programa pede porcentagem(%) do total que responderam 5 ou menos do total de entrevistados?
 A quantidade pesquisados = 200 ou um While?
    */