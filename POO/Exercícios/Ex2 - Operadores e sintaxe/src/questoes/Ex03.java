package questoes;

import java.util.Scanner;

public class Ex03 {
	static int fatorial(int n) {
		int x, z = 0;
		int y = 1;
		while (true) {
			x = (n - y);
			z = n * x;

			if (x != 1) {
				System.out.print(n + " * " + x + " = " + z + " -> ");
			} else {
				System.out.print(n + " * " + x + " = " + z);
			}
			y++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o fatorial que deseja obter: ");
		int x = sc.nextInt();
		int rs = fatorial(x);
	}
}
