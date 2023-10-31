// Lê dois números e mostra a soma. Ante do resultado, deverá aparecer a mensagem: SOMA

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int num1, num2;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            num1 = leitor.nextInt();
            System.out.println("\nDigite o segundo número: ");
            num2 = leitor.nextInt();
        }
        System.out.format("\nSOMA\n%d + %d = %d", num1, num2, soma(num1, num2));
    }

    static int soma(int a, int b) {
        return a + b;
    }
}
