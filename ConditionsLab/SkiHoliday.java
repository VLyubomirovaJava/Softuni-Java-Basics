package ConditionsLab;

import java.util.Scanner;

public class SkiHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String review = scanner.nextLine();
        int nights = days - 1;
        //poneje si trugva
        double price = 0;
        double total = 0;
        switch (room) {
            case "room for one person":
                price = 18;
                total = price * nights;
                break;
            case "apartment":
                price = 25;
                total = price * nights;
                if (days < 10) {
                    total = total - (total * 0.30);
                } else if (days > 10 && days < 15) {
                    total = total - (total * 0.35);
                } else if (days > 15) {
                    total = total - (total * 0.50);
                }
                break;
            case "president apartment":
                price = 35;
                total = price * nights;
                if (days < 10) {
                    total = total - (total * 0.10);
                } else if (days > 10 && days < 15) {
                    total = total - (total * 0.15);
                } else if (days > 15) {
                    total = total - (total * 0.20);
                }
                break;
        }
        if (review.equals("positive")) {
            total = total + (total * 0.25);
        } else {
            total = total - (total * 0.10);
        }
        System.out.printf("%.2f", total);
    }
}