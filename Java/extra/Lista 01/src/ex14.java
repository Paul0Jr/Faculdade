// Lê um valor de hora e informa quantos minutos se passaram desde o início do dia.

import java.util.Scanner;

public class ex14 {
    static int relogio(int a) {
        int x = a * 60;
        return x;
    }

    public static void main(String[] args) {
        int horas;
        System.out.println("Digite a hora que deseja usar para calcular os minutos: ");
        try (Scanner leitor = new Scanner(System.in)) {
            horas = leitor.nextInt();
        }

        System.out.format("\nJá se passaram exatos %d minutos desde o início do dia", relogio(horas));
    }
}
