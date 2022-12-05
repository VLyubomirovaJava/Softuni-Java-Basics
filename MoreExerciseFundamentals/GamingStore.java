package MoreExerciseFundamentals;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program that helps you buy the games.
// The valid games are the following games in this table:
//OutFall 4	$39.99
//CS: OG	$15.99
//Zplinter Zell	$19.99
//Honored 2	$59.99
//RoverWatch	$29.99
//RoverWatch Origins Edition	$39.99

//On the first line, you will receive your current balance
        String input = scanner.nextLine();
        double availableBalance = Double.parseDouble(input);
        double totalMoney = availableBalance;
        double gamePrice = 0;
        double totalSpent = 0;

//Until you receive the command "Game Time", you have to keep buying games.
        while (true) {
            //•	If at any point, the user has $0 left, print "Out of money!" and end the program.
            if (availableBalance == 0) {
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();

            if ("Game time".equalsIgnoreCase(input)) {
                break;
            }
// game alternatives and their prices
            switch (input) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                default:
                    // in case the game is not one of these
                    System.out.println("Not found");
                    break;
            }
            // when user is buying, balance is decreasing
            if (availableBalance >= gamePrice && gamePrice > 0) {
                totalSpent += gamePrice;
                availableBalance -= gamePrice;
                System.out.printf("Bought %s%n", input);
                // if the game is too expensive
            } else if (availableBalance < gamePrice && gamePrice > 0) {
                System.out.println("Too Expensive");
            }
            gamePrice = 0;
        }
        if (availableBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, totalMoney - totalSpent);
        }
    }
}
