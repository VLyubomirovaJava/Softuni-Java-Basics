package PBExam;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double djobni = Double.parseDouble(scanner.nextLine());
        double dailyProfit = Double.parseDouble(scanner.nextLine());
        double allCosts = Double.parseDouble(scanner.nextLine());
        double GiftPrice = Double.parseDouble(scanner.nextLine());
        double totalprofit = dailyProfit * 5;
        double spesteniDjobni = djobni * 5;
        double totalspesteni = totalprofit + spesteniDjobni;
        double totalMoney = totalspesteni -allCosts;
        if (totalMoney>=GiftPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",totalMoney);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.",GiftPrice-totalMoney);

        }

    }
}