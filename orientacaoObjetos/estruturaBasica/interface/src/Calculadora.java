public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("SOMA: " + (operando1 + operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("SUBTRACAO: " + (operando1 - operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("DIVISAO: " + (operando1 / operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("MULTIPLICACAO: " + (operando1 * operando2));
    }
}
