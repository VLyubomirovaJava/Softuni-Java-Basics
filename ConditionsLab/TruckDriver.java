package ConditionsLab;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double KmPerMonth = Double.parseDouble(scanner.nextLine());
        double payPerKm = 0;
        switch (season) {
            case "Spring":
            case "Autumn":
                if (KmPerMonth <= 5000) {
                    payPerKm = 0.75 * KmPerMonth;
                } else if (KmPerMonth > 5000 & KmPerMonth <= 10000) {
                    payPerKm = 0.95 * KmPerMonth;
                } else {
                    payPerKm = 1.45 * KmPerMonth;
                }
                break;
            case "Summer":
                if (KmPerMonth <= 5000) {
                    payPerKm = 0.90 * KmPerMonth;
                } else if (KmPerMonth > 5000 & KmPerMonth <= 10000) {
                    payPerKm = 1.10 * KmPerMonth;
                } else {
                    payPerKm = 1.45 * KmPerMonth;
                }
                break;
            case "Winter":
                if (KmPerMonth <= 5000) {
                    payPerKm = 1.05 * KmPerMonth;
                } else if (KmPerMonth > 5000 & KmPerMonth <= 10000) {
                    payPerKm = 1.25 * KmPerMonth;
                } else {
                    payPerKm = 1.45 * KmPerMonth;
                }
                break;
        }
        double salaryPerMonth = payPerKm - (payPerKm * 0.10);
        double salarySeason = salaryPerMonth * 4;
        System.out.printf("%.2f", salarySeason);
    }
}