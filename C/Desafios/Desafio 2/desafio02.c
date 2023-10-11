#include <stdio.h>
#include <stdlib.h>

int main()
{
    int qtd[5], i = 0;
    char produto[5][30];
    float total[5], valor_unit[5];

    for (i = 0; i < 5; i++)
    {
        printf("\nInforme o nome do produto: ");
        scanf("%s", &produto[i]);
        printf("\nInforme a quantidade comprada do %d produto: ", i + 1);
        scanf("%d", &qtd[i]);
        printf("\nInforme o valor unitário do produto: ");
        scanf("%f", &valor_unit[i]);
        total[i] = qtd[i] * valor_unit[i];
        printf("\n======================================================================\n");
    }
    for (i = 0; i < 5; i++)
    {
        printf("\nForam compradas %d unidades do produto %s de código %d com valor unitário de %.2f. O total custará R$ %.2f\n", qtd[i], produto[i], i + 1, valor_unit[i], total[i]);
    }

    return 0;
}