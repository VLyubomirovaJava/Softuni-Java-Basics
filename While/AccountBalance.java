package While;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("NoMoreMoney")) {
            double currentDeposit = Double.parseDouble(input);
            if (currentDeposit < 0) {
                System.out.println("Invalid operation!");
                break; }
            sum += currentDeposit;
            System.out.printf("Increase: %.2f%n", currentDeposit);
            input =scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
