package addTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.print("Введите значение а: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.print("Введите значение b: ");
        Scanner in1 = new Scanner(System.in);
        double b = in1.nextDouble();

        System.out.print("Введите операцию над числами (+, -, *, /): ");
        Scanner in2 = new Scanner(System.in);
        String operation = in2.next();

        switch (operation) {
            case "+":
                System.out.println(calc.add(a, b));
                break;
            case "-":
                System.out.println(calc.sub(a, b));
                break;
            case "*":
                System.out.println(calc.mul(a, b));
                break;
            case "/":
                try {
                    System.out.println(calc.div(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Не правильная операция");
        }
    }
}
