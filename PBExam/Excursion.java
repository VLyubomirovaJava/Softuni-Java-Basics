package PBExam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double PricePerPerson = 0;
        double Price = 0;
        switch (season) {
            case "spring":
                if (people <= 5) {
                    PricePerPerson = 50;
                    Price = PricePerPerson * people;
                } else if (people > 5) {
                    PricePerPerson = 48;
                    Price = PricePerPerson * people;
                }
                break;
            case "summer":
                if (people <= 5) {
                    PricePerPerson = 48.50 - (48.50 * 0.15);
                    Price = PricePerPerson * people;
                } else if (people > 5) {
                    PricePerPerson = 45 - (45 * 0.15);
                    Price = PricePerPerson * people;
                }
                break;
            case "autumn":
                if (people <= 5) {
                    PricePerPerson = 60;
                    Price = PricePerPerson * people;
                } else if (people > 5) {
                    PricePerPerson = 49.5;
                    Price = PricePerPerson * people;
                }
                break;
            case "winter":
                if (people <= 5) {
                    PricePerPerson = 86 + (86 * 0.08);
                    Price = PricePerPerson * people;
                } else if (people > 5) {
                    PricePerPerson = 85 + (85 * 0.08);
                    ;
                    Price = PricePerPerson * people;
                }
                break;
        }
        System.out.printf("%.2f leva.", Price);
    }
}
