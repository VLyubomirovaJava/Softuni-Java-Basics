package AdditionalConditions;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int FoodLeft = Integer.parseInt(scanner.nextLine());
        double DogFood = Double.parseDouble(scanner.nextLine());
        double CatFood = Double.parseDouble(scanner.nextLine());
        double TurtleFood = Double.parseDouble(scanner.nextLine());
        double Dog = days * DogFood;
        double Cat = days * CatFood;
        double Turtle = days * TurtleFood / 1000;
        double total = (Turtle + Cat + Dog) ;
        double left = 0;

        if (FoodLeft >= total) {
            left = FoodLeft-total;
            System.out.printf("%.0f kilos of food left.",Math.floor(left));
        }else {
            left = total - FoodLeft;
                System.out.printf("%.0f more kilos of food are needed.",Math.ceil(left));
            }
        }
    }
