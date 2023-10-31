// Mostrar a média aritmética entre 3 números passados pelo usuário.

import java.util.Scanner;

public class ex02 {
    static double media(double a, double b, double c) {
        double x;
        x = (a + b + c) / 3;
        return x;
    }

    public static void main(String[] args) {
        double a, b, c;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite a primeira nota: ");
            a = leitor.nextDouble();
            System.out.println("\nDigite a segunda nota: ");
            b = leitor.nextDouble();
            System.out.println("\nDigite a terceira nota: ");
            c = leitor.nextDouble();
        }
        System.out.format("\nA média do aluno foi de %.2f\n", media(a, b, c));
    }
}
