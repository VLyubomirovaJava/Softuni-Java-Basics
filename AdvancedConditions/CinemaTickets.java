package AdvancedConditions;

import java.io.PrintStream;
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Day = scanner.nextLine();
        int price = 0;
        if (Day.equals("Monday") || Day.equals("Tuesday") || Day.equals("Friday")){
            price = 12;
            System.out.println(price);
        }
    if (Day.equals("Wednesday")||Day.equals("Thursday")){
price = 14;
System.out.println(price);
    }
    if (Day.equals("Saturday")||Day.equals("Sunday")){
        price =16;
        System.out.println(price);
        }
    }
}