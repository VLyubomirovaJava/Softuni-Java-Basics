package ForLoopLab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double WasherPrice = Double.parseDouble(scanner.nextLine());
        int ToyPrice = Integer.parseInt(scanner.nextLine());
        int toysCount = 0;
        double money = 0;
        int brother = 0;
        double allMoney =0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                allMoney=money +allMoney;
                brother++;
            } else {
                toysCount++;
            }
        }
        int toysTotal = toysCount * ToyPrice;
        double totalMoney = allMoney + toysTotal - brother;
        double diff = Math.abs(WasherPrice - totalMoney);
        if (totalMoney >= WasherPrice) {
            System.out.printf("Yes! %.2f", totalMoney - WasherPrice);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}