/* Escreva um programa que leia duas strings e as coloque na tela. Imprima 
também a segunda letra de cada string. */
#include <stdio.h>
#include <stdlib.h>

int main()
{
  char string[80];

  for(int i=0; i<2; i++)
  {
    printf("\nDigite a %d° palavra: ", i+1);
    gets(string);
  
    printf("\nA %d° palavra digitada foi %s", i+1, string);
    printf("\nA segunda letra da %d palavra é: %c\n", i+1, string[1]);
   }

  return 0;
}