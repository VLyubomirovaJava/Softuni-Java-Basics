package DataTypesVariables;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        // kolko puti shte nalivame
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        // sumata na nalqtata voda do sega
        int sum = 0;
        //vurtim cikul dokato stignem broikata cikli dadeni ot konzolata
        for (int i =1 ; i <= numberOfLines; i++) {
            //vseki pyt chetem stoinost litri voda ot konzolata
            int pouredLitres = Integer.parseInt(scanner.nextLine());
            // dobavqme q kum obshtoto do momenta
            sum += pouredLitres;
            //proverqvame dali ne e nadvishila kapaciteta
            if (sum > capacity) {
                System.out.println("Insufficient capacity!");
                //ne zahojdame tezi litri kum obshtoto, poneje nadvishavat
                sum -= pouredLitres;
            }
        }
        System.out.println(sum);
    }
}