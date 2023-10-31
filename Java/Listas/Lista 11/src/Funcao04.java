
//Importa a biblioteca Math do Java
import java.math.*;

public class Funcao04 {
    // Cria um método para realizar alguns cálculos com a biblioteca Math;
    // Utiliza retorno void para que o metódo não retorne valores e usa-se static
    // para que
    // seja declarado um método de classe;
    // Cria as duas variáveis de retorno double que serão substituídas no futuro por
    // números;
    static void calcular(double a, double b) {
        // Retorna o menor valor inteiro da divisão a / b;
        System.out.println(Math.floor(a / b));

        // Retorna o maior valor inteiro da divisão a / b;
        System.out.println(Math.ceil(a / b));

        // Retorna o menor valor;
        System.out.println(Math.min(a, b));
        // Retorna o maior valor;
        System.out.println(Math.max(a, b));

        // Retorna a elevado b;
        System.out.println(Math.pow(a, b));

        // Retorna a raiz quadrada de a + b;
        System.out.println(Math.sqrt(a + b));

        // Retorna o valor absoluto de -a - b;
        System.out.println(Math.abs(-a - b));
    }

    public static void main(String[] args) {
        // Chama o método calcular para declarar valores as variáveis a e b;
        // Substitui a por 2 e b por 3.
        calcular(2, 3);
    }
}
