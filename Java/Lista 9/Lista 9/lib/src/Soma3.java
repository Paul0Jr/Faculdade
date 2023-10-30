import java.util.Scanner;

public class Soma3{
    public static int somatoria(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int num1, num2, num3, result;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            num1 = leitor.nextInt();
            System.out.println("\nDigite o segundo número: ");
            num2 = leitor.nextInt();
             System.out.println("\nDigite o terceiro número: ");
            num3 = leitor.nextInt();
            result = somatoria(num1, num2, num3);
        }
        System.out.format("\nA soma de %d + %d + %d = %d", num1, num2, num3, result);
    }
}
