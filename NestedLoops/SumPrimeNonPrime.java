package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int SumPrime = 0;
        int SumNonPrime = 0;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int counter = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                    //namirame prosto ili neprosto delitel
                }
            }
            if (counter == 2) { //taka znaem che e prosto
                SumPrime += number;
                //subirame prosti;
            } else {
                SumNonPrime += number;
                //subirame neprosti;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",SumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n",SumNonPrime);
    }
}