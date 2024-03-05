package Parte_3;

import java.util.Scanner;

public class questao_02 {
	static int tabela(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		return n;
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int x = sc.nextInt();
		System.out.println();
		tabela(x);
	}
}