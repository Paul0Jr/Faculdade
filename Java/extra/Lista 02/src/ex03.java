/* Faça um programa que leia cinco números inteiros, calcule e escreva a soma, o 
produto e a média dos números lidos */

import java.util.Scanner;

public class ex03 {
    static void calculos(int a, int b, int c, int d, int e) {
        int x = a + b + c + d + e;
        int y = a * b * c * d * e;
        double z = (double) x / 5;

        System.out.printf("\nSOMA: %d\nPRODUTO: %d\nMÉDIA: %.2f", x, y, z);
    }

    public static void main(String[] args) {
        int n1, n2, n3, n4, n5;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Informe 5 números: ");
            n1 = leitor.nextInt();
            n2 = leitor.nextInt();
            n3 = leitor.nextInt();
            n4 = leitor.nextInt();
            n5 = leitor.nextInt();
            calculos(n1, n2, n3, n4, n5);
        }
    }
}