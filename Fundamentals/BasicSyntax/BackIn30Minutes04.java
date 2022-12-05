package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minWithIncrease = minutes + 30;
        if (minWithIncrease >= 59) {
            hour++;
            minWithIncrease = minWithIncrease - 60;
        }
        if (hour == 24) {
            hour = 0;
        }
        System.out.printf("%d:%d", hour, minWithIncrease);
    }
    }