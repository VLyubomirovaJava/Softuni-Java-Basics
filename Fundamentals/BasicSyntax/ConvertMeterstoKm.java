package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class ConvertMeterstoKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short meters = Short.parseShort(scanner.nextLine());
        double kilometres = meters / 1000.0;
        System.out.printf("%.2f",kilometres);
    }
}
