package Lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double puzzlePrice = puzzles * 2.60;
        double dollsPrice = dolls * 3;
        double bearsPrice = bears * 4.10;
        double minionPrice = minions * 8.20;
        double truckPrice = trucks * 2;
        double profit = puzzlePrice + bearsPrice + minionPrice + truckPrice + dollsPrice;
        double toys = puzzles + dolls + bears + minions + trucks;
        System.out.println(profit);
        if (toys >= 50) {
            profit = profit - (profit * 0.25);
        }
        double totalProfit = profit - (profit * 0.10);
        if (totalProfit >= trip) {
            System.out.printf("Yes! %.2f lv left.", totalProfit - trip);
        } else {
            System.out.printf("Not enough money! $.2f lv needed.", trip - totalProfit);
        }
    }
}



