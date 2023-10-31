//Lê o saldo de uma aplicação e imprima o novo saldo, considerado o reajuste de 1%.

import java.util.Scanner;

public class ex08 {
    static double reajuste(double a) {
        return a * 1.1;
    }

    public static void main(String[] args) {
        double num;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o valor que sofrerá o reajuste: ");
            num = leitor.nextDouble();
        }

        System.out.format("O valor %.2f com reajuste de 1%% ficará %.2f", num, reajuste(num));
    }
}
