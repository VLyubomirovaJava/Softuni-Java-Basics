package MoreExerciseFundamentals;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a method that returns the English name of the last digit of a given number.
// Write a program that reads an integer and prints the returned value from this method.

        int number = Integer.parseInt(scanner.nextLine());
        // getting the last digit by calling the method from below
       int lastDigit=(findLastDigit(number));
       switch (lastDigit) {
           case 0:
               System.out.println("zero");
               break;
           case 1:
               System.out.println("one");
               break;
           case 2:
               System.out.println("two");
               break;
           case 3:
               System.out.println("three");
               break;
           case 4:
               System.out.println("four");
               break;
           case 5:
               System.out.println("five");
               break;
           case 6:
               System.out.println("six");
               break;
           case 7:
               System.out.println("seven");
               break;
           case 8:
               System.out.println("eight");
               break;
           case 9:
               System.out.println("nine");
               break;
       }
    }
    public static int findLastDigit(int number){
        //finding the last digit by diving by 10
       return Math.abs(number % 10);

        }
    }
