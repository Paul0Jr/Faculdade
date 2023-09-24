/* Uma determinada empresa armazena para cada funcionário (10 no total) uma ficha contendo o
código, o número de horas trabalhadas e o seu número de dependentes.

Considerando que:
a. A empresa paga 12 reais por hora e 40 reais por dependentes.
b. Sobre o salário são feitos descontos de 8,5% para o INSS e 5% para IR.

Faça um programa para ler o código, número de horas trabalhadas e número de dependentes de
cada funcionário. Após a leitura, escreva qual o código, os valores descontados para cada tipo de
imposto e finalmente o salário líquido de cada um dos funcionários. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int codigo, horas, dependentes, salario_bruto;
    float salario_liquido, inss, ir;

    for(int i=0; i<10; i++)
    {
        printf("\nInforme o código do %d° funcionário: ", i+1);
        scanf("%d", &codigo);
        printf("Informe a quantidade de horas trabalhadas: ");
        scanf("%d", &horas);
        printf("Insira a o número de dependentes: ");
        scanf("%d", &dependentes);

        horas*=12;
        dependentes*=40;
        salario_bruto=horas+dependentes;
        inss=salario_bruto*0.085;
        ir=salario_bruto*0.05;
        salario_liquido=salario_bruto-inss-ir;

        printf("\nCódigo do funcionário: %d\nDesconto do INSS = %.2f. Desconto do Imposto de Renda = R$ %.2f.\nSalário a ser recebido = R$ %.2f\n", codigo, inss, ir, salario_liquido);
    }

    return 0;
}