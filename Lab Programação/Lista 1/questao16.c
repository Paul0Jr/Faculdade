#include <stdio.h>

int main(){
    float valor = 0.0, inss = 0.0;
    int horas = 0;

    puts("Digite o valor da aula: ");
    scanf("%f", &valor);

    puts("Digite o total de horas trabalhadas neste mês: ");
    scanf("%d", &horas);

    puts("Digite o percentual de desconto INSS: ");
    scanf("%f", &inss);

    printf("O seu salário bruto é de R$%.2f. O total líquido recebido será de R$%.2f!",valor*horas, valor*horas - valor*horas * inss/100);
    
    return 0;
    
}