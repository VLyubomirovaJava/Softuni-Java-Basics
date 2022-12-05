package Lab;

import java.util.Scanner;

public class Godzilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Budget = Double.parseDouble(scanner.nextLine());
        int Statisti = Integer.parseInt(scanner.nextLine());
        double ClothesPrice = Double.parseDouble(scanner.nextLine());
        double Decor = Budget * 0.10;
        double allClothes = ClothesPrice * Statisti;
        if (Statisti > 150) {
            allClothes = allClothes - ( allClothes * 0.10);
        }
        double totalsum = allClothes + Decor;
        if (totalsum > Budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalsum -Budget);
        } else {
            System.out.println("Action!");
            System.out.printf(" Wingard starts filming with %.2f leva left.", Budget-totalsum);
        }
    }
}