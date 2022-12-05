package ConditionsLab;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String TrackType =scanner.nextLine();
        double taxJuniors = 0;
        double taxSeniors = 0;
        double expenses1 = 0;
        int totalParticipants = juniors + seniors;
        switch (TrackType){
            case"trail":
                taxJuniors = 5.50;
                taxSeniors = 7;
                break;
            case"cross-country":
                if (totalParticipants >= 50){
                    taxJuniors = 8-(8 * 0.25);
                    taxSeniors = 9.50 - (9.50 * 0.25);
                } else {
                    taxJuniors = 8;
                    taxSeniors = 9.50;
                }
                break;
            case"downhill":
                taxJuniors = 12.25;
                taxSeniors = 13.75;
                break;
            case"road":
                taxJuniors = 20;
                taxSeniors = 21.50;
                break;
        }
        double money = taxJuniors * juniors + taxSeniors * seniors;
        double expenses2 = money -(money * 0.05);
        System.out.printf("%.2f",expenses2);
    }
}