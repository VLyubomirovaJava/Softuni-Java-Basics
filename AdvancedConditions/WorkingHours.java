package AdvancedConditions;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        boolean isWorkingDays = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday");
        boolean isWorkingHours = time >= 10 && time <= 18;
        if (isWorkingHours && isWorkingDays) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}