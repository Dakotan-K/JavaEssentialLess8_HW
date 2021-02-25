package task2;

import java.util.Scanner;

public class Main {
    // Задача не решена
    public static void main(String[] args) {

        Worker[] worker = new Worker[4];

        for (int i = 0; i < worker.length; i++) {

            System.out.print("Введите фамилию: ");
            Scanner in1 = new Scanner(System.in);
            String surname = in1.next();

            System.out.print("Введите должность: ");
            Scanner in2 = new Scanner(System.in);
            String post = in2.next();

            System.out.print("Введите стаж (лет): ");
            Scanner in3 = new Scanner(System.in);
            String year = in3.next();

            worker[i] = new Worker(surname, post, year);
        }

        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].toString());
        }
    }
}
