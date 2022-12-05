package ConditionsLab;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double ApartmentPrice = 0;
        double totalStudio = 0;
        double totalAprt = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                ApartmentPrice = 65;
                totalStudio = nights * studioPrice;
                totalAprt = nights * ApartmentPrice;
                if (nights > 7 && nights <14) {
                    totalStudio = totalStudio - (totalStudio * 0.05);
                } else if (nights > 14) {
                    totalStudio = totalStudio - (totalStudio * 0.3);
                    totalAprt = totalAprt - (totalAprt * 0.1);
                }
                break;

            case "June":
            case "September":
                studioPrice = 75.20;
                ApartmentPrice = 68.70;
                totalStudio = nights * studioPrice;
                totalAprt = nights * ApartmentPrice;
                if (nights > 14) {
                    totalStudio = totalStudio - (totalStudio * 0.2);
                    totalAprt = totalAprt - (totalAprt * 0.1);
                }
                break;

            case "July":
            case "August":
                studioPrice = 76;
                ApartmentPrice = 77;
                totalStudio = nights * studioPrice;
                totalAprt = nights * ApartmentPrice;
                if (nights > 14) {
                    totalAprt = totalAprt - (totalAprt * 0.10);
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv. \nStudio: %.2f lv.", totalAprt, totalStudio);
    }
}
