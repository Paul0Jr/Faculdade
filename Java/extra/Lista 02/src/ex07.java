/* Faça um programa que leia o número do funcionário, o número de horas 
trabalhadas mensais, o valor que recebe por hora e o número de filhos com idade 
menor de 14 anos. Calcular e escrever o salário deste funcionário, sendo que cada 
filho menor de 14 anos acrescenta 10% do salário */

import java.util.Scanner;

public class ex07 {
    static double salario(double a, int b, int c) {
        double x = a * b;
        double y = x + (x * ((float) c / 10));
        return y;
    }

    public static void main(String[] args) {
        int horas, filhos;
        double valor;

        System.out.print("Digite o total de horas trabalhadas: ");
        try (Scanner leitor = new Scanner(System.in)) {
            horas = leitor.nextInt();
            System.out.print("Digite o valor que recebe por hora trabalhada: ");
            valor = leitor.nextInt();
            System.out.print("Digite o total de filhos menores de 14 anos: ");
            filhos = leitor.nextInt();
        }
        System.out.printf("\nO total que o funcionário deve receber é de R$%.2f", salario(valor, horas, filhos));
    }
}