package Lab;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int Ram = Integer.parseInt(scanner.nextLine());
        double Cards = videoCards * 250;
        double Processor = Cards * 0.35;
        double CenaProcessor = Processor * processor;
        double RAM = Cards * 0.10;
        double RAMCena = RAM * Ram;
        double total = Cards + CenaProcessor + RAMCena;
        if (videoCards>processor){
            total = total - (total*0.15);
        }
        if (total <= budget) {
            System.out.printf("You have %.2f leva left!", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - total));
        }
    }
}
