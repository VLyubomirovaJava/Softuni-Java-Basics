package ConditionsLab;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String Season = scanner.nextLine();
        String Class = "";
        String Car = "";
        double price = 0;
        if (budget <= 100 && Season.equals("Summer")) {
            Class = "Economy class";
            Car = "Cabrio";
            price = budget * 0.35;
        } else if (budget <= 100 && Season.equals("Winter")) {
            Class = "Economy class";
            Car = "Jeep";
            price = budget * 0.65;
        }
        if (budget > 100 && budget <= 500 && Season.equals("Summer")) {
            Class = "Compact class";
            Car = "Cabrio";
            price = budget * 0.45;
        } else if (budget > 100 && budget <= 500 && Season.equals("Winter")) {
            Class = "Compact class";
            Car = "Jeep";
            price = budget * 0.80;
        }
        if (budget > 500) {
            Class = "Luxury class";
            Car = "Jeep";
            price = budget * 0.90;
        }
        System.out.printf("%s%n", Class);
        System.out.printf("%s - %.2f", Car, price);
    }
}
