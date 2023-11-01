/* Faça um programa que leia A, B e C e calcule a seguinte fórmula: (7*C+5*B) / 
(2*A*3) */

import java.util.Scanner;

public class ex05 {
    static void calculo(int a, int b, int c) {
        double x = (7 * c + 5 * b) / (2 * a * 3);
        System.out.println("\n" + x);
    }

    public static void main(String[] args) {
        int A, B, C;
        System.out.print("Informe o valor de A: ");
        try (Scanner leitor = new Scanner(System.in)) {
            A = leitor.nextInt();
            System.out.print("Informe o valor de B: ");
            B = leitor.nextInt();
            System.out.print("Informe o valor de C: ");
            C = leitor.nextInt();
        }
        calculo(A, B, C);
    }
}