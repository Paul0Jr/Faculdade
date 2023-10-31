//Mostrar na tela o produto entre 28 e 43.

public class ex01 {
    public static void main(String[] args) {
        int a = 28, b = 43;

        System.out.format("%d * %d = %d", a, b, produto(a, b));
    }

    static int produto(int a, int b) {
        return a * b;
    }
}
