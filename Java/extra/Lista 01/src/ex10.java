// Lê o raio de um círculo e mostre como saída o perímetro (2*π*Raio) e a área (π*Raio2).

import java.util.Scanner;
import java.math.*;

public class ex10 {
    static double perimetro(int a) {
        double x = 2 * Math.PI * (double) a;
        return x;
    }

    static double area(int a) {
        double y = Math.PI * Math.pow(a, 2);
        return y;
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Digite o valor do raio: ");
        try (Scanner leitor = new Scanner(System.in)) {
            num = leitor.nextInt();
        }

        System.out.format("\nO perímetro do círculo é de %.2f cm\nA área do círculo é de %.2f cm²", perimetro(num),
                area(num));
    }
}
