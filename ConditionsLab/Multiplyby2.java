package ConditionsLab;

import java.util.Scanner;

public class Multiplyby2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double result = 0;
        while (num >= 0) {
            result = num * 2;
            System.out.printf("\nResult: %.2f", result);

           num=Double.parseDouble(scanner.nextLine());    }
        if (num < 0) {
            System.out.println("\nNegative number!");
        }
    }
}