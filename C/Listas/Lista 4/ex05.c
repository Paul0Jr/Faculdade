/* Um vendedor necessita de um programa que calcule o preço total devido por um cliente. O programa
deve receber o código de um produto e a quantidade comprada e calcular o preço total, usando a
tabela abaixo. Mostrar uma mensagem no caso de código inválido.
Cod. Produto | Preço Unitário
  1001           R$ 5,32
  1324           R$ 6,45
  6548           R$ 2,37
  987            R$ 5,32
  7623           R$ 6,45 */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int codigo, quantidade;
    float preco_total;

    printf("Informe o código do produto:");
    scanf("%d", &codigo);
    printf("\nInforme a quantidade compradas do produto de código %d: ", codigo);
    scanf("%d", &quantidade);

    if (codigo == 1001 || codigo == 987)
    {
        preco_total = quantidade * 5.32;
        printf("O preço total a ser pago no produto será de R$ %.2f", preco_total);
    }
    else if (codigo == 1324 || codigo == 7623)
    {
        preco_total = quantidade * 6.45;
        printf("O preço total a ser pago no produto será de R$ %.2f", preco_total);
    }
    else if (codigo == 6548)
    {
        preco_total = quantidade * 2.37;
        printf("O preço total a ser pago no produto será de R$ %.2f", preco_total);
    }
    else
    {
        printf("\nErro na digitação do código!\n");
    }

    return 0;
}