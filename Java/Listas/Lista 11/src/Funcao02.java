public class Funcao02 {

    // Cria um método para cálculo de produtos notáveis;
    // Utiliza retorno double para calcular com exatidáo e usa-se static para que
    // seja declarado um método de classe;
    // Cria as duas variáveis de retorno double que serão substituídas no futuro por
    // números;
    static double calcular(double a, double b) {

        // Criação da variável double x para ser calculado os produtos notáveis;
        double x;
        x = a * a + 2 * a * b + b * b;

        // Retorna x como valor do método de classe;
        return x;
    }

    public static void main(String[] args) {

        // Declara a variável de saída como double para ter exatidão no cálculo;
        double resposta;

        // Chama o método de classe criado anteriormente e associa os valores a=2 e b=3
        // para o cálculo do produto notável;
        resposta = calcular(2, 3);

        // Saída para o usuário sendo 25.0.
        System.out.println(resposta);
    }

}
