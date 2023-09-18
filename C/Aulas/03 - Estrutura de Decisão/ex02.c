/* A Secretaria de Meio Ambiente, que controla o índice de
poluição, mantém 3 grupos de indústrias que são
altamente poluentes do meio ambiente. O índice de
poluição aceitável varia de 0,05 até 0,29. Se o índice sobe
para 0,3 as indústrias do 1o grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4
as industrias do 1o e 2o grupo são intimadas a
suspenderem suas atividades, se o índice atingir 0,5 todos
os grupos devem ser notificados a paralisarem suas
atividades. Faça um programa que leia o índice de poluição
medido e emita a notificação adequada aos diferentes
grupos de empresas.  */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float indice;
    printf("Informe o índice de poluição: ");
    scanf("%f", &indice);

    if(indice<=0.29)
    {
        printf("\nAs indústrias estão mantendo um nível aceitável!\n");
    }
    else
    {
        if(indice>=0.3)
        {
            printf("\nAs indústrias do primeiro grupo deverão ter suas atividades suspensas!\n");
        }
        else if (indice>=0.4)
        {
            printf("\nAs indústrias do primeiro e segundo grupo deverão ter suas atividades suspensas!\n");
        }
        else if(indice>=0.5)
        {
            printf("\nTodos os grupos devem ter suas atividades temporariamente suspensas!\n");
        }  
    }

    return 0;
}