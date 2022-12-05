package AdvancedConditions;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        boolean isValidFruit = fruit.equals("banana") ||
                fruit.equals("apple") ||
                fruit.equals("orange") ||
                fruit.equals("grapefruit") ||
                fruit.equals("kiwi") ||
                fruit.equals("pineapple") ||
                fruit.equals("grapes");

        boolean WorkDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday");

        boolean Weekend = day.equals("Saturday") ||
                day.equals("Sunday");

        boolean isValidDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday") ||
                day.equals("Sunday");

        if (Weekend && fruit.equals("banana")) {
            price = 2.70;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }
        if (WorkDay && fruit.equals("banana")) {
            price = 2.50;
            double total = price * quantity;
            System.out.printf("%.2f",total);        }

        if (Weekend && fruit.equals("apple")) {
            price = 1.25;
            double total = price * quantity;
            System.out.printf("%.2f",total);        }
        if (WorkDay && fruit.equals("apple")) {
            price = 1.20;
            double total = price * quantity;
            System.out.printf("%.2f",total);        }

        if (Weekend && fruit.equals("orange")) {
            price = 0.90;
            double total = price * quantity;
            System.out.printf("%.2f",total);        }
        if (WorkDay && fruit.equals("orange")) {
            price = 0.85;
            double total = price * quantity;
            System.out.printf("%.2f",total);        }

        if (Weekend && fruit.equals("grapefruit")) {
            price = 1.60;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }
        if (WorkDay && fruit.equals("grapefruit")) {
            price = 1.45;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }

        if (Weekend && fruit.equals("kiwi")) {
            price = 3.00;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }
        if (WorkDay && fruit.equals("kiwi")) {
            price = 2.70;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }
        if (Weekend && fruit.equals("pineapple")) {
            price = 5.60;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }

        if (WorkDay && fruit.equals("pineapple")) {
            price = 5.50;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }

        if (WorkDay && fruit.equals("grapes")) {
            price = 3.85;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }
        if (Weekend && fruit.equals("grapes")) {
            price = 4.20;
            double total = price * quantity;
            System.out.printf("%.2f",total);
        }
        if (!isValidDay || !isValidFruit) {
            System.out.println("error");
        }
    }
}