package Parte_3;

import java.util.Scanner;

public class questao_03 {
    static int fatorial(int n) {
        int x = 0;
        int f = n;
        int z = n;
        while (true) {
            x = (n - 1);
            f = f * x;
            if (x > 1) {
                System.out.printf("%d * %d = %d | ", z, x, (z * x));
            } else {
                System.out.printf("%d * %d = %d ", z, x, (z * x));
                System.out.printf("\n\nFatorial de %d = %d ", z, f);

                break;
            }
            n--;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o fatorial que deseja obter: ");
        int x = sc.nextInt();
        System.out.print("\n");
        fatorial(x);
    }
}