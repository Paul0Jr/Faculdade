/*  Faça um programa que leia as variáveis y e z. Após, calcule e mostre o valor de x, 
dado pela expressão:
x =  y*(y22 + z33) */

import java.util.Scanner;

public class ex09 {
    static void raiz(int a, int b) {
        double x = Math.sqrt(a * (Math.pow(a, 22) + Math.pow(b, 33)));

        System.out.printf("\n%.2f", x);
    }

    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Informe o valor de Y: ");
        try (Scanner leitor = new Scanner(System.in)) {
            n1 = leitor.nextInt();
            System.out.print("Informe o valor de Z: ");
            n2 = leitor.nextInt();
        }
        raiz(n1, n2);
    }
}