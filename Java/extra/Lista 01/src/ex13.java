// Leia o numerador e o denominador de uma fração e transforme-o em um número decimal

import java.util.Scanner;

public class ex13 {
    static double decimal(int a, int b) {
        double x = (double) a / (double) b;
        return x;
    }

    public static void main(String[] args) {
        int num, denom;
        System.out.println("Informe o valor do numerador: ");
        try (Scanner leitor = new Scanner(System.in)) {
            num = leitor.nextInt();
            System.out.println("\nDigite o valor do denominador: ");
            denom = leitor.nextInt();
        }
        System.out.format("\nA fração %d/%d em forma decimal é %.2f", num, denom, decimal(num, denom));
    }
}
