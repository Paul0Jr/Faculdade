/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escrever um programa em C que leia o custo de fábrica de um carro e escreva o 
custo ao consumidor. */

import java.util.Scanner;

public class ex08 {
    static double carro(double a, int b, int c) {
        double x = a + (a * ((float) b / 100)) + (a * ((float) c / 100));
        return x;
    }

    public static void main(String[] args) {
        double custo;
        System.out.print("Informe o valor de custo de fábrica do veículo: ");
        try (Scanner leitor = new Scanner(System.in)) {
            custo = leitor.nextDouble();
        }
        System.out.printf("\nO custo ao consumidor será no total R$%.2f", carro(custo, 28, 45));
    }
}