/* Um Banco concederá um crédito especial aos seus
clientes, variável com o saldo médio no último ano. Faça
um algoritmo que leia o saldo médio de um cliente e
calcule o valor do crédito de acordo com a tabela abaixo.
Mostre uma mensagem informando o saldo médio e o valor
do crédito.

Saldo médio        | Percentual
de 0 a 200,00      | nenhum crédito (crédito = 0)
de 201,00 a 400,00 | 20% do valor do saldo médio
de 401,00 a 600,00 | 30% do valor do saldo médio
acima de 600,00    | 40% do valor do saldo médio  */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float saldo_medio;
    printf("Informe o seu saldo médio: ");
    scanf("%f", &saldo_medio);

    if (saldo_medio <= 200)
    {
        printf("\nO seu saldo não permite um percentual de crédito.\n");
    }
    else if (saldo_medio >= 201)
    {
        printf("De acordo com o saldo medio de R$%.2f, o seu percentual de crédito será de R$%.2f\n", saldo_medio, saldo_medio * 0.2);
    }
    else if (saldo_medio >= 401)
    {
        printf("De acordo com o saldo medio de R$%.2f, o seu percentual de crédito será de R$%.2f\n", saldo_medio, saldo_medio * 0.3);
    }
    else if (saldo_medio >= 600)
    {
        printf("De acordo com o saldo medio de R$%.2f, o seu percentual de crédito será de R$%.2f\n", saldo_medio, saldo_medio * 0.4);
    }

    return 0;
}