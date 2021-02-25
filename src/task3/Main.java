package task3;

import java.util.Scanner;

public class Main {
    // Задача не решена
    public static void main(String[] args) {

        Price[] price = new Price[5];

        for (int i = 0; i < price.length; i++) {
            System.out.println("Введите название товара: ");
            Scanner in1 = new Scanner(System.in);
            String product = in1.next();

            System.out.println("Введите название магазина: ");
            Scanner in2 = new Scanner(System.in);
            String store = in2.next();

            System.out.println("Введите цену товара: ");
            Scanner in3 = new Scanner(System.in);
            String priceProduct = in3.next();

            price[i] = new Price(product, store, priceProduct);
        }
        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i].toString());
        }
    }
}
