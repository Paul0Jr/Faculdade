// Lê um número e mostra a terça parte deste número.

import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        float num;
        try(Scanner leitor = new Scanner(System.in)){
            System.out.println("Digite o número: ");
            num = leitor.nextFloat();
        }
        System.out.format("A terça parte de %.1f = %.1f", num, terca_parte(num));
    }

    static float terca_parte(float a){
        return a/3;
    }
}
