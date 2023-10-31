#include <stdio.h>
#include <stdlib.h>
main()
{    
int codigo_produto, codigo_cliente, quantidade;
float preco_unitario, valor_total;

printf ("\n1. Digite o cod. do cliente ou Digite zero para sair: ");
scanf ("%d", &codigo_cliente);
    while (codigo_cliente!=0){
          valor_total=0;
          printf ("\n\t2. Digite o codigo do produto. Digite -1 para encerrar a execucao: ");
          scanf ("%d", &codigo_produto);      
          while (codigo_produto!=-1){
               printf ("\n\t\t3. Digite a quantidade comprada pelo cliente %d do produto %d: ", codigo_cliente, codigo_produto);
               scanf ("%d", &quantidade);
               printf ("\n\t\t4. Digite o valor unitario do produto %d: ", codigo_produto);
               scanf ("%f", &preco_unitario);
               valor_total=quantidade*preco_unitario;
               printf ("\n\n\t2. Digite o codigo do produto. Digite -1 para encerrar a execucao: ");
               scanf ("%d", &codigo_produto);
          }          
          printf ("\n=====================================================");
          printf("\nO custo unitário do produto de código %d é de R$%.2f ", codigo_produto, preco_unitario);
          printf ("\nO cliente %d deve pagar R$ %.2f por uma quantidade total de %d produtos", codigo_cliente, valor_total, quantidade);
          printf ("\n=====================================================");
          printf ("\n\n1. Digite o codigo do cliente. Digite zero para encerrar a execucao: ");
          scanf ("%d", &codigo_cliente);
    }
    system("pause");
}