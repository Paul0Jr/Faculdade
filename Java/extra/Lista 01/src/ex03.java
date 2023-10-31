//Lê um número e mostra seu sucessor e seu antecessor na tela.

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int num;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o número: ");
            num = leitor.nextInt();
        }
        System.out.format("\nO seu sucessor é %d e seu antecessor é %d\n", num + 1, num - 1);
    }
}
