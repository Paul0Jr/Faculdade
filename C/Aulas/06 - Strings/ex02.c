/* Escreva um programa que leia uma string, conte quantos caracteres desta string são iguais a 'a' e substitua os 
que forem iguais a 'a' por 'b'. O programa deve imprimir o número de caracteres modificados e a string 
modificada. */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
  char string[50];
  int conta=0;
  
  printf("\nDigite uma palavra: ");
  gets(string);
  int len= strlen(string);

  for(int i=0; i<len; i++)
  {
     if(string[i]=='a')
       {
          conta++;
          string[i]='b';
        }
     else if(string[i]=='A')
       {
          conta++;
          string[i]='B';
       }
    }

    if(conta<=0)
    {
        printf("\nNenhuma letra A foi trocada!\n");
    }
    else
    {
        printf("A palavra digitada com as letras A trocadas por letras B seria: %s\n", string);
    }

  return 0;
}