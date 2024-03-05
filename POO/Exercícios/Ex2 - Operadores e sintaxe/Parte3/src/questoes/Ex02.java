package questoes;

import java.util.Scanner;

public class Ex02 {
	static int tabela(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor para N: ");
		int x = sc.nextInt();
		int rs = tabela(x);
	}
}