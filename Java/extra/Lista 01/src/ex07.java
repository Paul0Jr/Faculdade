/* Leia 4 números e mostre a média ponderada, sabendo-se que os pesos são 
respectivamente: 1, 2, 3 e 4. */

import java.util.Scanner;

public class ex07 {
    static float media_ponderada(float a) {
        float x = a / (1 + 2 + 3 + 4);
        return x;
    }

    public static void main(String[] args) {
        float num = 0, soma = 0;
        try (Scanner leitor = new Scanner(System.in)) {
            for (int i = 1; i < 5; i++) {
                System.out.format("Digite o %d° número: ", i);
                num = leitor.nextFloat();
                soma+=(i*num);
            }
        }
        System.out.format("\nA média ponderada será de %.2f ", media_ponderada(soma));
    }
}
