/* Faça um programa que leia o número do funcionário, o número de horas
trabalhadas mensais, o valor que recebe por hora e o número de filhos com idade
menor de 14 anos. Calcular e escrever o salário deste funcionário, sendo que cada
filho menor de 14 anos acrescenta 10% do salário. */
#include <stdio.h>
#include <stdlib.h>

int main()
{   
    int numero;
    float horas,filhos,porcentagem,salario,valor,total;
    printf("Digite seu número: ");
    scanf("%d", &numero);
    printf("Insira o total de horas mensais trabalhadas: ");
    scanf("%f", &horas);
    printf("O valor que recebe por hora trabalhada: ");
    scanf("%f", &valor);
    printf("Quantidades de filhos com menos de 14 anos de idade: ");
    scanf("%f", &filhos);

    porcentagem=10*filhos;
    salario=horas*valor;
    total=(porcentagem/100)*salario;

    printf("O total do salário recebido pelo funcionário de número %d será de R$%.2f",numero,salario+total);
    return 0;
}