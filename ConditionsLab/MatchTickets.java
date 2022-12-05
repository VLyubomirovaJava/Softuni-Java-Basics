package ConditionsLab;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        var people = Integer.parseInt(scanner.nextLine());
double price = 0.0;
        double transport=0.0;
        switch (category) {
            case "VIP":
                price = 499.99 * people;
                break;
            case "Normal":
                price = 249.99 * people;
                break;
        }
        if (people>=1 &people <= 4) {
            transport = (budget * 0.75);
        } else if (people >= 5 && people <= 9) {
            transport =  (budget * 0.60);
        } else if (people <= 24) {
            transport =  (budget * 0.50);
        } else if (people >= 25 && people <= 49) {
            transport =  (budget * 0.40);
        } else {
            transport =  (budget * 0.25);
        }
        double total = transport + price;
        double diff = (budget -total);
        double diff2 = Math.abs( total-budget);
        if (budget >= total) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",diff2);
        }
    }
}

