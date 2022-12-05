package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double availableCash = Double.parseDouble(scanner.nextLine());
//•	The amount of money George Lucas has
        int studentsCount = Integer.parseInt(scanner.nextLine());
//•	The count of students
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
//•	The price of lightsabers for a single saber
        double robePrice = Double.parseDouble(scanner.nextLine());
//•	The price of robes for a single robe
        double beltPrice = Double.parseDouble(scanner.nextLine());
//•	The price of belts for a single belt
        double lightsaberCost =  Math.ceil(studentsCount + 0.10 * studentsCount)*lightsaberPrice;
        double robeCost = robePrice * studentsCount;
        double beltCost = (studentsCount - studentsCount / 6) * beltPrice;
// namirame ako ima 6ti bezplaten
        double totalSum = lightsaberCost + robeCost + beltCost;
        if (totalSum <= availableCash) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else if (totalSum > availableCash) {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - availableCash);
        }
    }
}
