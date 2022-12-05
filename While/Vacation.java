package While;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double MoneyNeededForTrip = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int SpendingCounter = 0;
        while (availableMoney < MoneyNeededForTrip && SpendingCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if (command.equals("save")) {
                availableMoney += money;
                SpendingCounter = 0;
            } else if (command.equals("spend")) {
                availableMoney -= money;
                SpendingCounter += 1;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            }
            if (SpendingCounter == 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysCounter);}
            if (availableMoney >= MoneyNeededForTrip) {
                System.out.printf("You saved the money for %d days.", daysCounter);
            }
        }
    }
}