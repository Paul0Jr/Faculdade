/* Lê dois números e mostre os seguintes resultados:
a. Dividendo:
b. Divisor:
c. Quociente:
d. Resto (para calcular o resto de uma divisão, utilize o operador MOD */

import java.util.Scanner;

public class ex06 {
    static void calculos(int a, int b) {
        System.out.format("Dividendo = %d", a);
        System.out.format("\nDivisor = %d", b);
        System.out.format("\nQuociente = %.1f", a / (float) b);
        System.out.format("\nResto = %d", a % b);

    }

    public static void main(String[] args) {
        int num1, num2;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            num1 = leitor.nextInt();
            System.out.println("\nDigite o segundo número: ");
            num2 = leitor.nextInt();
        }
        calculos(num1, num2);
    }
}
