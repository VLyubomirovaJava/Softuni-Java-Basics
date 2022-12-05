package ConditionsLab;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double BoatRent = 0;
        switch (season) {
            case "Spring":
                BoatRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                BoatRent = 4200;
                break;
            case "Winter":
                BoatRent = 2600;
                break;
        }
        if (fishermen <= 6) {
            BoatRent = BoatRent - (BoatRent * 0.10);
        } else if (fishermen> 7 && fishermen<=11) {
            BoatRent = BoatRent - (BoatRent * 0.15);
        } else if (fishermen> 12) {
            BoatRent = BoatRent - (BoatRent * 0.25);
        }
        if (fishermen % 2 ==0 && !(season.equals("Autumn"))) {
          BoatRent = BoatRent - (BoatRent *0.05);
        }
if (budget>= BoatRent){
    System.out.printf("Yes! You have %.2f leva left.",budget - BoatRent );
    } else if (BoatRent>budget) {
    System.out.printf("Not enough money! You need %.2f leva.",BoatRent -budget );
}

    }
}
