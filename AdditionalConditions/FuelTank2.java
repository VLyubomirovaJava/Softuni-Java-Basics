package AdditionalConditions;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Fuel = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        String MembershipCard = scanner.nextLine();
        double price = 0;
        if (MembershipCard.equals("Yes")){
            switch (Fuel) {
                case "Diesel":
                    price= (2.33 - 0.12) * litres;
                    break;
                case "Gas":
                    price = (0.93 - 0.08) * litres;
                    break;
                case "Gasoline":
                    price = (2.22 - 0.10) * litres;
                    break;
            }
        } else {
            switch (Fuel) {
                case "Diesel":
                    price = 2.33 * litres ;
                    break;
                case "Gasoline":
                    price = 2.22 * litres;
                    break;
                case "Gas":
                    price = 0.93 * litres;
                    break;
            }
        }  if (litres >= 20 && litres <= 25) {
                price *= 0.92;
                System.out.printf("%.2f lv.", price);
            } else if (litres > 25){
            price *= 0.90;
                System.out.printf("%.2f lv.", price);
            } else {
                System.out.printf("%.2f lv.", price);
            }
        }
    }







