package questoes;

import java.util.Scanner;

public class Ex01 {
	static int calculo(int x) {
		int y = 0;
		while (true) {
			if (x % 2 == 0) { // par
				y = x / 2;
			} else { // ímpar
				y = 3 * x + 1;
			}
			if (y != 1) {
				x = y;
				System.out.print(y + "->");
			} else {
				System.out.print(y + ".");
				break;
			}
		}
			return y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para X: ");
		int x = sc.nextInt();
		int result = calculo(x);
	}
}
