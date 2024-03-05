package Parte_3;

import java.util.Scanner;

public class questao_01 {
    static int calculo(int x) {
        int y = 0;
        while (true) {
            if (x % 2 == 0) { // par
                y = x / 2;
            } else { // ímpar
                y = 3 * x + 1;
            }
            if (y != 1) {
                x = y;
                System.out.printf("%d -> ", y);
            } else {
                System.out.printf("%d.", y);
                break;
            }
        }
            return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para X: ");
        int x = sc.nextInt();
        System.out.print("\n");
        calculo(x);
    }
}