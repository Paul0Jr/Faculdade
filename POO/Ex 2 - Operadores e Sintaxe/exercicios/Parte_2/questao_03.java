package Parte_2;

import java.util.Scanner;

public class questao_03 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite um valor para X: ");
			int x = sc.nextInt();
			int y = (x%2==0) ? x/2 : 3*x+1;
			System.out.println(y);
		}
	}
}
