package AdditionalConditions;

import java.util.Scanner;

public class SleepyTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DaysOff = Integer.parseInt(scanner.nextLine());
        int WorkingDays = 365 - DaysOff;
        int RealGameTime = WorkingDays * 63 + DaysOff * 127;
        int norma = 30000;
        int DifferenceGameTime = norma - RealGameTime;
        int mins = Math.abs(norma - RealGameTime) % 60;
        int hours = Math.abs(norma - RealGameTime) / 60;
        if (RealGameTime>30000){
            System.out.println("Tom will run away");
            System.out.printf("%s hours and %s minutes more for play", hours, mins);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf ("%s hours and %s minutes less for play", hours, mins);
        }
    }
}