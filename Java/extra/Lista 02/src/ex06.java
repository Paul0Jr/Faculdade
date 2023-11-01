/* Faça um programa que leia a idade de uma pessoa expressa em dias e mostre-a 
expressa em anos, meses e dias. */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a idade em dias: ");
            int idadeEmDias = scanner.nextInt();

            int anos = idadeEmDias / 365;
            int meses = (idadeEmDias % 365) / 30;
            int dias = (idadeEmDias % 365) % 30;

            System.out.println("Idade em anos: " + anos + " anos");
            System.out.println("Idade em meses: " + meses + " meses");
            System.out.println("Idade em dias: " + dias + " dias");
        }
    }
}