/* Uma empresa realizou uma pesquisa com os seus fornecedores, na qual foram coletados os
seguintes dados referentes aos produtos fornecidos:
 ID, Valor e Percentual de aumento
Obs. Se o produto não tiver sofrido alteração de preço, o percentual de aumento será igual a 0.

Faça um programa que determine e escreva:
 O novo valor de cada um dos produtos.
 A quantidade de produtos mais caros que R$ 100,00 (após aumento) e que tiveram aumento
superior a 5%.
 A média de valor dos produtos que não sofreram aumento.
 O valor do produto mais caro (após aumento).

Obs.: o programa solicita dados até que o ID digitado seja zero. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int id, percentual, mais_caros = 0, id_caro = 0, total = 0, nao_alterado = 0;
    float novo_valor, valor, media, soma = 0.0, mais_caro = 0.0;

    while (1 == 1)
    {
        printf("\nInsira seu ID(O para sair): ");
        scanf("%d", &id);
        if (id <= 0)
        {
            break;
        }
        printf("Insira o valor: ");
        scanf("%f", &valor);
        printf("Qual o percentual de aumento: ");
        scanf("%d", &percentual);
        total++;

        // O novo valor de cada um dos produtos
        if (percentual > 0)
        {
            novo_valor = valor + (valor * ((float)percentual / 100));
            if (novo_valor >= 100 && percentual >= 5)
            {
                mais_caros++;
            }

            if (total == 1)
            {
                mais_caro = novo_valor;
                id_caro = id;
            }

            else
            {
                if (novo_valor > mais_caro)
                    mais_caro = novo_valor;
                id_caro = id;
            }
            printf("\nO novo valor do produto de ID %d será de R$%.2f\n", id, novo_valor);
        }

        // Valor não alterado
        else
        {
            nao_alterado++;
            soma += valor;
        }
    }
    media = soma / nao_alterado;

    if (total > 0)
    {
        if (mais_caros > 0)
        {
            printf("\nA quantidade de produtos mais caros que R$ 100,00 (após aumento) e que tiveram aumento superior a 5%% = %d", mais_caros);
        }
        if (nao_alterado > 0)
        {

            printf("\nA média de valor dos produtos que não sofreram aumento = R$%.2f", media);
        }
        printf("\nO valor do produto mais caro é de R$%.2f com o ID %d\n", mais_caro, id_caro);
    }

    return 0;
}