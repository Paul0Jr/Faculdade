public class Funcao06 {

    // Cria um método para trocar valores;
    // Utiliza retorno void para que não haja retorno de valores e usa-se static
    // para que seja declarado um método de classe;
    // Cria três variáveis de retorno inteiro que serão substituídas no futuro por
    // números;
    static void AlgumasOperacoes(int a, int b, int c) {
        // Cria uma quarta variável dentro do método;
        int t;

        // Utiliza do método ImprimeValores que tem função apenas de printar na tela do
        // usuário;
        ImprimeValores(a, b, c);

        // A variável t assume o atual valor de a, sendo assim t=10;
        t = a;

        // A variável a assume o atual valor de b, sendo assim a=20;
        a = b;

        // A variável b assume o atual valor de c, sendo assim b=30;
        b = c;

        // A variável c assume o atual valor de t, sendo assim c=10;
        c = t;

        // No final, os valores ficam a=20, b=30 e c=10;
        ImprimeValores(a, b, c);
    }

    // Cria um método para imprimir valores;
    // Utiliza retorno void para que não haja retorno de valores e usa-se static
    // para que seja declarado um método de classe;
    // Cria três variáveis de retorno inteiro que serão substituídas no futuro por
    // números;
    static void ImprimeValores(int a, int b, int c) {
        System.out.println("A=" + a + ", B=" + b + ", C=" + c);
    }

    public static void main(String[] args) {

        //Chama o primeiro método criado;
        //Troca os valores de a, b e c por números inteiros;
        AlgumasOperacoes(10, 20, 30);
    }
}
