//Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

import java.util.Scanner;

public class ex01 {

    static int total_dias(int a, int b, int c) {
        int x = (a * 365) + (b * 30) + c;
        return x;
    }

    public static void main(String[] args) {
        int anos, meses, dias;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite sua idade em anos: ");
            anos = leitor.nextInt();
            System.out.println("\nDigite os meses vividos desde que completou " + anos + " anos: ");
            meses = leitor.nextInt();
            System.out.println("\nInforme os dias vividos desde que completou " + anos + " e " + meses + " meses: ");
            dias = leitor.nextInt();
        }
        System.out.printf("\nVocê viveu um total de %d dias!", total_dias(anos, meses, dias));
    }

}