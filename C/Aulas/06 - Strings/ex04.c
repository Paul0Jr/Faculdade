/* Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, conforme a tabela abaixo.
Faça um programa que leia o salário e o cargo de um funcionário e calcule o novo salário.
Se o cargo do funcionário não estiver na tabela, ele deverá então receber 40% de aumento.
Mostre o salário antigo, o novo salário e a diferença.
 Cargo      | Percentual
•Gerente    | 10%
•Engenheiro | 20%
•Técnico    | 30%  */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char cargo[20];
    float salario;

    printf("Informe o seu cargo(digite S para Sair): ");
    gets(cargo);
    printf("Insira o salário: ");
    scanf("%f", &salario);

    if (strcmp(cargo,"Gerente")==0 || strcmp(cargo,"gerente")==0)
    {
        printf("\nO seu antigo salário era R$%.2f", salario);
        printf("\nO seu novo salário será de R$%.2f", salario * 1.1);
        printf("\nA diferença entre o salário antigo e novo é de R$%.2f\n", (salario * 1.1) - salario);
    }
    else if (strcmp(cargo,"Engenheiro")==0 || strcmp(cargo,"engenheiro")==0)
    {
        printf("\nO seu antigo salário era R$%.2f", salario);
        printf("\nO seu novo salário será de R$%.2f", salario * 1.2);
        printf("\nA diferença entre o salário antigo e novo é de R$%.2f\n", (salario * 1.2) - salario);
    }
    else if (strcmp(cargo,"Técnico")==0 || strcmp(cargo,"técnico")==0)
    {
        printf("\nO seu antigo salário era R$%.2f", salario);
        printf("\nO seu novo salário será de R$%.2f", salario * 1.3);
        printf("\nA diferença entre o salário antigo e novo é de R$%.2f\n", (salario * 1.3) - salario);
    }
    else
    {
        printf("\nO seu antigo salário era R$%.2f", salario);
        printf("\nO seu novo salário será de R$%.2f", salario * 1.4);
        printf("\nA diferença entre o salário antigo e novo é de R$%.2f\n", (salario * 1.4) - salario);
    }

    return 0;
}