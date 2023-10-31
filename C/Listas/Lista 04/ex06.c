/* Ler um número inteiro, e verificar se o número corresponde a um mês válido no calendário e
escrever o nome do mês, senão escrever uma mensagem ‘Mês Inválido’. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num;
    printf("Informe um número: ");
    scanf("%d", &num);

    switch (num)
    {
    case 1:
        printf("\nO mês de número %d equivale equivale a Janeiro!\n", num);
        break; 
     case 2:
        printf("\nO mês de número %d equivale equivale a Fevereiro!\n", num);
        break;   
     case 3:
        printf("\nO mês de número %d equivale equivale a Março!\n", num);
        break; 
     case 4:
        printf("\nO mês de número %d equivale equivale a Abril!\n", num);
        break;
     case 5:
        printf("\nO mês de número %d equivale equivale a Maio!\n", num);
        break;
     case 6:
        printf("\nO mês de número %d equivale equivale a Junho!\n", num);
        break;
     case 7:
        printf("\nO mês de número %d equivale equivale a Julho!\n", num);
        break;  
     case 8:
        printf("\nO mês de número %d equivale equivale a Agosto!\n", num);
        break;
     case 9:
        printf("\nO mês de número %d equivale equivale a Setembro!\n", num);
        break;
     case 10:
        printf("\nO mês de número %d equivale equivale a Outubro!\n", num);
        break;
     case 11:
        printf("\nO mês de número %d equivale equivale a Novembro!\n", num);
        break;
     case 12:
        printf("\nO mês de número %d equivale equivale a Dezembro!\n", num);
        break;
    default:
        printf("\nO número %d não corresponde a um mês válido!\n", num);
        break;
    }

    return 0;
}