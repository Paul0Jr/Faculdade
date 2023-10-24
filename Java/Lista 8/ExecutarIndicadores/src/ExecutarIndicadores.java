public class ExecutarIndicadores {
    private Indicadores indicador1;

    public ExecutarIndicadores(int valor1, int valor2, int valor3) {
        this.indicador1 = new Indicadores(valor1, valor2, valor3);
    }

    public void ImprimirIndicadores() {
        indicador1.ImprimirIndicadores();
    }

    public static void main(String[] args) {
        ExecutarIndicadores executar = new ExecutarIndicadores(1,2,3);
        executar.ImprimirIndicadores();
    }
}