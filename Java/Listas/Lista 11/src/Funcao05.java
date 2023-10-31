public class Funcao05 {
    // Cria um método booleano de negação;
    // Utiliza retorno boolean para retorna apenas true ou false e usa-se static
    // para que
    // seja declarado um método de classe;
    // Cria uma variável de retorno boolean;
    static boolean nao(boolean p) {
        // Retorna a negação de p;
        return !p;
    }

    public static void main(String[] args) {

        // Cria a variável booleana var que servirá para testar o método criado;
        boolean var;

        // Declara a variável sendo verdadeira;
        var = true;

        // Printa o valor de var, sendo no caso True;
        System.out.println(var);

        // Faz a utilização do método booleano nao e substitui p por var
        // Como var é verdadeira e o método sempre retornará o oposto, então a saída
        // será False;
        System.out.println(nao(var));

        // Utilizando duas vezes o método booleano criado anteriormente e substituindo p
        // por var;
        // Resolvendo o primeiro método de dentro: ele sempre retornará o valor oposto
        // do que está sendo declarado, no caso o oposto de True;
        // Resolvendo o método de fora: como ele retorna o oposto do que está sendo
        // declarado, então ele deixa de ser False e passar a ser True.
        System.out.println(nao(nao(var)));
    }
}
