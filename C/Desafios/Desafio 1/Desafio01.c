#include <stdio.h>
#include <stdlib.h>

int main()
{
    float media, soma, numero; 
    int maior, menor, contador=0;
    char user;
    
    while (user!='N')
    {   
        printf("Deseja adicionar um número? S/N ");
        scanf("%c", &user);
        if (user=='S')
        {
            printf("Digite apenas números inteiros positivos: ");
            scanf("%f", &numero);
            contador++;
            soma=soma+numero;
            if(contador==1)
            {
                maior=menor=numero;
            }
            else
                if(numero>maior)
                {
                    maior=numero;
                }
                else if (numero<menor)
                {
                    menor=numero;
                }
        }
    }
    media = soma/contador;

    printf("\nUm total de %d números foram digitados!", contador);
    printf("\nA média dos valores digitados é igual a %.1f", media);
    printf("\nO maior valor digitado foi %d", maior);
    printf("\nO menor valor digitado foi %d", menor);

    return 0;    
}