import java.util.Scanner;

public class Soma1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            num1 = leitor.nextInt();
            System.out.println("\nDigite o segundo número: ");
            num2 = leitor.nextInt();
        }
        result = num1 + num2;
        System.out.format("\nA soma de %d + %d = %d", num1, num2, result);
    }
}
