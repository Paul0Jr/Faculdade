/* Entre com a base e a altura de um retângulo e mostre os resultados:
a. Perímetro (Perímetro é igual à soma dos 4 lados)
b. Área (Área é igual à lado vezes lado) */

import java.util.Scanner;

public class ex09 {
    static int perimetro(int a, int b) {
        return a + b;
    }

    static int area(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int base, altura;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o valor da base: ");
            base = leitor.nextInt();
            System.out.println("\nDigite o valor da altura: ");
            altura = leitor.nextInt();
        }

        System.out.format("\nO perímetro do retângulo = %d\nA área do retângulo = %d", perimetro(altura, base),
                area(altura, base));
    }
}
