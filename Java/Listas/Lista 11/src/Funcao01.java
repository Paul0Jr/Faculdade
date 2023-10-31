public class Funcao01 {

    // Método para calcular A^2 + B;
    // Utiliza retorno inteiro para que o retorno do método seja um valor inteiro e
    // utiliza static para que o método seja um método de classe;
    // Cria duas variáveis de retorno int para serem substituídas no futuro por
    // números inteiros;
    static int caixaPreta(int a, int b) {

        // Retorna o próprio cálculo diretamente do método caixaPreta;
        return a * a + b;
    }

    public static void main(String[] args) {

        // Inicia a variável inteira que servirá de saída no futuro;
        int resposta;

        // Chama o método caixaPreta, associando-o a variável criada dentro do PSVM e
        // designando os seguintes valores de A e B que método necessita;
        resposta = caixaPreta(3, 5);

        // Saída do variável com os valores de A=3 e B=5, sendo resultado = 14.
        System.out.println(resposta);
    }
}
