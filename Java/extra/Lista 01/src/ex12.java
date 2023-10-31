/*Calcule o valor de uma prestação em atraso, utilizando a fórmula: PRESTAÇÃO = 
VALOR + (VALOR * (TAXA/100) * TEMPO). */

import java.util.Scanner;

public class ex12 {
    static double prestacao(double a, int b, int c) {
        double x = a + (a * ((double) b / 100) * (double) c);
        return x;
    }

    public static void main(String[] args) {
        int taxa, tempo;
        double valor = 0;
        System.out.println("Digite o valor em atraso: ");
        try (Scanner leitor = new Scanner(System.in)) {
            valor = leitor.nextDouble();
            System.out.println("\nDigite a porcentagem da taxa: ");
            taxa = leitor.nextInt();
            System.out.println("\nDigite o tempo da prestação em meses: ");
            tempo = leitor.nextInt();
        }

        System.out.format("\nA sua prestação será de R$%.2f", prestacao(valor, taxa, tempo));
    }
}
