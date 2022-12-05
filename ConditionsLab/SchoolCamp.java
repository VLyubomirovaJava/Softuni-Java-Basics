package ConditionsLab;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String season =scanner.nextLine();
String group =scanner.nextLine();
int students =Integer.parseInt(scanner.nextLine());
int days =Integer.parseInt(scanner.nextLine());
double pricePerNight=0;
String sports ="";
switch(season){
    case"Winter":
if (group.equals("girls")){
   pricePerNight=9.60*days;
   sports = "Gymnastics";
}
 if (group.equals("mixed")) {
    pricePerNight= 10 * days;
    sports = "Ski";
} if (group.equals("boys")) {
        pricePerNight=9.60*days;
        sports = "Judo";
    }
    break;
    case "Spring":
        if (group.equals("girls")){
        pricePerNight = 7.20 * days;
        sports = "Athletics";
    } if (group.equals("mixed")) {
        pricePerNight=9.50 * days;
        sports = "Cycling";
    }  if (group.equals("boys")) {
        pricePerNight=7.20 * days;
        sports = "Tennis";
    }
    break;
    case "Summer":
        if (group.equals("girls")){
        pricePerNight=15 * days;
        sports = "Volleyball";
    }  if (group.equals("mixed")) {
        pricePerNight=20 * days;
        sports = "Swimming";
    } if (group.equals("boys")) {
        pricePerNight=15 * days;
        sports = "Football";
    }
    break;
}
double pricePerGroup =pricePerNight*students;
double totalWithDisc=0;
if (students>=50){
    totalWithDisc = pricePerGroup - (pricePerGroup*0.50);
} else if (students>=20 && students<50) {
    totalWithDisc = pricePerGroup - (pricePerGroup*0.15);
} else if (students>=10 && students<20) {
    totalWithDisc = pricePerGroup - (pricePerGroup*0.05);
} else {
    totalWithDisc =pricePerGroup;
}
        System.out.printf("%s %.2f lv.",sports,totalWithDisc);
    }
}
