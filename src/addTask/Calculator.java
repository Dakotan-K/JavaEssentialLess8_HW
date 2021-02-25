package addTask;

public class Calculator {

    public double add (double a, double b){
        return a + b;
    }

    public double sub (double a, double b) {
        return a - b;
    }

    public double mul (double a, double b) {
        return a * b;
    }

    public double div (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }
}
