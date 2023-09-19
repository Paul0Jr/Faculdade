/* Faça um programa que realize a venda de
produtos a clientes:

• Cada cliente pode comprar vários produtos.
• Sobre cada produto comprado por cada cliente, leia a quantidade de unidades compradas e o preço unitário.
• Encerre a entrada de produtos para um cliente quando o código do produto lido for -1.
• Mostre, para cada cliente, o valor total da sua compra.
• Encerre a entrada de clientes quando o código do cliente lido for zero. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int codigo_produto, codigo_cliente, cont1 = 1;
    float quantidades, preco_unitario;
    while (cont1 > 0)
    {
        printf("Informe o código do cliente: ");
        scanf("%d", &codigo_cliente);
        if (codigo_cliente == 0)
        {
            break;
        }
        else
        {

            while (cont1 > 0)
            {
                printf("\nInforme o código do produto: ");
                scanf("%d", &codigo_produto);
                if (codigo_produto == -1)
                {
                    break;
                }
                else
                {
                    printf("\nInsira o valor unitário do produto: ");
                    scanf("%f", &preco_unitario);
                    printf("\nInsira a quantidade de produtos que serão comprados: ");
                    scanf("%f", &quantidades);

                    printf("\nValor total da compra do produto de código %d = R$%.2f\n", codigo_produto, preco_unitario * quantidades);
                    cont1++;
                    print("\n");
                }
            }
        }
    }

    return 0;
}