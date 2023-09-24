/* Faça um programa que solicite ao usuário 10 números inteiros e, ao final, informe a quantidade
de números ímpares e pares lidos. Calcule também a soma dos números pares e a média dos
números ímpares. */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, somar_par = 0, somar_impar=0, par = 0, impar = 0;
    float media_impar, media_par;
    for (int i = 0; i < 10; i++)
    {
        printf("Informe o %d° valor: ", i + 1);
        scanf("%d", &num);

        if (num % 2 == 0)
        {
            par++;
            somar_par+=num;
        }
        else if (num % 2 == 1)
        {
            impar++;
            somar_impar+=num;
        }
    }
    
    if(par>0)
    {
    media_par=somar_par/(float) par;
    printf("\nUm total de %d números pares foram digitados. A soma dos números pares = %d\nA média dos números pares = %.2f\n", par, somar_par, media_par);
    }
    else
    {
        printf("\nNenhum número par foi digitado!\n");
    }
    if (impar>0)
    {
        media_impar=somar_impar/(float) impar;
        printf("\nUm total de %d números ímpares foram digitados. A soma dos números ímpares = %d\nA média dos números ímpares = %.2f\n", impar, somar_impar, media_impar);  
    }
    else
    {
        printf("\nNenhum número par foi digitado!\n");
    }

    return 0;
}