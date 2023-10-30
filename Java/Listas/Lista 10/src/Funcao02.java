import java.util.Scanner;

public class Funcao02 {
    public static double produtos(double a, double b){
        return (a*a) + (2*a*b) + (b*b);
    }
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;

        try(Scanner leitor = new Scanner(System.in)){
        System.out.println("Digite o valor de a:");
        num1 = leitor.nextDouble();
        System.out.println("\nDigite o valor de b:");
        num2 = leitor.nextDouble();
        result = produtos(num1, num2);
        }
        System.out.format("\n%.1f^2 + 2 * %.1f * %.1f + %.1f^2 = %.1f", num1, num1, num2, num2, result);
    }

}

