/* Faça um programa que leia dois valores nas variáveis A e B respectivamente, 
troque o valor contido na variável A pelo valor em B, e o valor em B pelo valor em A, 
isto é, imprimiremos A e B com os valores trocados. */

import java.util.Scanner;

public class ex02 {
    static void troca(int a, int b) {
        int t;
        t = a;
        a = b;
        b = t;

        System.out.printf("\nA = %d\nB = %d", a, b);
    }

    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Informe o valor de A: ");
        try (Scanner leitor = new Scanner(System.in)) {
            n1 = leitor.nextInt();
            System.out.print("Informe o valor de B: ");
            n2 = leitor.nextInt();
        }
        troca(n1, n2);
    }
}