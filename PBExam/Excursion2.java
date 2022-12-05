package PBExam;

import java.util.Scanner;

public class Excursion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SeaHolidays =Integer.parseInt(scanner.nextLine());
        int MountainHolidays = Integer.parseInt(scanner.nextLine());
        int SeaPrice = 680;
        int MountainPrice =499;
        String input = "";
        double profit =0.0;
        while (true) {
            input = scanner.nextLine();

            if (input.equals("Stop")) {
                System.out.printf("Profit: %.0f leva.", Math.floor(profit));
                break;
            } else if (SeaHolidays==0 && MountainHolidays== 0) {
                System.out.println("Good job! Everything is sold.");            }
            if (input.equals("sea") && SeaHolidays != 0) {
                profit += SeaPrice;
                SeaHolidays--;
            } else if (input.equals("mountain") && MountainHolidays != 0) {
                profit += MountainPrice;
                MountainHolidays--;
            }
            if (SeaHolidays == 0)
                if (MountainHolidays == 0)
                    break;
            if (MountainHolidays==0)
                if (SeaHolidays ==0)
                    break;
        }
        if (SeaHolidays==0 && MountainHolidays== 0){
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %.0f leva.", Math.floor(profit));

        }
    }
        }


