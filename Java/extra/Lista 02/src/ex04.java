/*  Faça um programa que leia dois valores inteiros (X e Y) e calcule X na potência Y. 
Observação: utilizar a função matemática. */

import java.util.Scanner;

public class ex04 {
    static double potencia(int a, int b) {
        double x = Math.pow(a, b);
        return x;
    }

    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Informe o valor da base: ");
        try (Scanner leitor = new Scanner(System.in)) {
            n1 = leitor.nextInt();
            System.out.print("Informe o valor do expoente: ");
            n2 = leitor.nextInt();
        }
        System.out.printf("\nO valor de %d elevado %d = %.0f", n1, n2, potencia(n1, n2));
    }
}