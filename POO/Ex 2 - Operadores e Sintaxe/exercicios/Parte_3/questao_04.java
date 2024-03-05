package Parte_3;

import java.util.Scanner;

public class questao_04 {
    static int fibonacci(int n) {
        int y = 1;
        int x = 1;
        int f = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.printf("%d -> %d -> ", i, i);
            } else {
                f = x + y;
                y = x;
                x = f;
                System.out.print((i!=n) ? f+" -> " : f + ".");
            }
        }
        return f;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o n-ésimo termo que deseja alcançar na sequência de Fibonacci: ");
            int x = sc.nextInt();
            System.out.print("\n");
            fibonacci(x);
        }
    }
}