package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int GroupSize =Integer.parseInt(scanner.nextLine());
String GroupType =scanner.nextLine();
String day =scanner.nextLine();
double pricePerPerson =0.0;
switch(GroupType) {
    case "Students":
        if (day.equals("Friday")) {
            pricePerPerson =  8.45;
        } else if (day.equals("Saturday")) {
            pricePerPerson =  9.80;
        } else if (day.equals("Sunday")) {
            pricePerPerson =  10.46;
        }
        break;
    case "Business":
        if (day.equals("Friday")) {
            pricePerPerson = 10.90;
        } else if (day.equals("Saturday")) {
            pricePerPerson =  15.60;
        } else if (day.equals("Sunday")) {
            pricePerPerson =  16;
        }
        break;
    case "Regular":
        if (day.equals("Friday")) {
            pricePerPerson = 15;
        } else if (day.equals("Saturday")) {
            pricePerPerson =  20;
        } else if (day.equals("Sunday")) {
            pricePerPerson = 22.50;
        }
        break;
}
double Price = pricePerPerson *GroupSize;
if (GroupType.equals("Students") && GroupSize>=30){
    Price = Price - Price*0.15;
} else if (GroupType.equals("Business")&&GroupSize>=100) {
    Price = Price - (10*pricePerPerson);
} else if (GroupType.equals("Regular") && GroupSize>=10&& GroupSize<=20) {
    Price=Price-Price*0.05;
}
        System.out.printf("Total price: %.2f",Price);
    }
    }