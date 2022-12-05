package ConditionsLab;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double budget = Double.parseDouble(scanner.nextLine());
String season = scanner.nextLine();
String resort ="";
double price = 0;
String destination ="";
switch (season){
    case "summer":
        resort = "Camp";
        if (budget<=100){
            price = budget *0.30;
            destination = "Bulgaria";
        } else if (budget<=1000) {
            price = budget * 0.40;
            destination = "Balkans";
        } else if (budget>1000) {
            price = budget *0.90;
            destination = "Europe";
            resort = "Hotel";
        }
        break;
    case "winter":
        resort = "Hotel";
        if (budget<=100){
            price = budget *0.70;
            destination = "Bulgaria";
        }  else if (budget<=1000) {
            price = budget *0.80;
            destination = "Balkans";
        }else if (budget>1000) {
            destination = "Europe";
            price = budget *0.90;
}           break;}
        System.out.printf("Somewhere in %s\n %s - %.2f", destination, resort,price);

}
}
