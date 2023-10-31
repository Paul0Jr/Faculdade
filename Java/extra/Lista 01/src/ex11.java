//Calcule e mostre a área de um triângulo (área é igual a (base x altura) dividido por 2)

import java.util.Scanner;

public class ex11 {
    static double area(int a, int b) {
        double x = ((double) a * (double) b) / 2;
        return x;
    }

    public static void main(String[] args) {
        int base, altura;
        System.out.println("Informe o valor da base do triângulo:");
        try (Scanner leitor = new Scanner(System.in)) {
            base = leitor.nextInt();
            System.out.println("\nDigite o valor da altura do triângulo:");
            altura = leitor.nextInt();
        }
        System.out.format("\nA área do triângulo = %.1f", area(altura, base));
    }
}
