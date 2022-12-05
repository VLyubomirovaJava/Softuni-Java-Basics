package While;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNeeded = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int CardPayments = 0;
        int CashPayments = 0;
        int counter = 0;
        int SuccessfulCard = 0;
        int SuccessfulCash = 0;
        while (sum < sumNeeded) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            int money = Integer.parseInt(input);
            counter++;
            if (counter % 2 == 0 && money >= 10) {
                SuccessfulCard++;
                CardPayments += money;
                sum += money;
                System.out.println("Product sold!");
            } else if (counter % 2 != 0 && money <= 100) {
                SuccessfulCash++;
                CashPayments += money;
                sum += money;
                System.out.println("Product sold!");
            } else {
                System.out.println("Error in transaction!");
            }
        }
        if (sum >= sumNeeded) {
            double AverageCash = CashPayments * 1.0 / SuccessfulCash;
            double AverageCard = CardPayments * 1.0 / SuccessfulCard;
            System.out.printf("Average CS: %.2f\n Average CC: %.2f", AverageCash, AverageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}