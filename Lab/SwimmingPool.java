package Lab;

import java.util.Scanner;

public class SwimmingPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Record = Double.parseDouble(scanner.nextLine());
        double Distance = Double.parseDouble(scanner.nextLine());
        double TimeInSec = Double.parseDouble(scanner.nextLine());
        double result = Distance * TimeInSec;
        double slowdown = Math.floor(Distance / 15);
        double resistance = slowdown * 12.5;
        double finalResult = result + resistance;
        if (Record > finalResult) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(Record-finalResult));
            // maths.ab e za vrushtane na negativniq rezultat v absolutna stoinost
        }
    }
}