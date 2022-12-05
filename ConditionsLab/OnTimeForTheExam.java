package ConditionsLab;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int ArrivalHour = Integer.parseInt(scanner.nextLine());
        int ArrivalMin = Integer.parseInt(scanner.nextLine());
        int ExamMinutes = hour * 60 + minutes;
        int ArrivalMinutes = ArrivalHour * 60 + ArrivalMin;
        int diff = Math.abs(ExamMinutes - ArrivalMinutes);
        if (ArrivalMinutes > ExamMinutes) {
            System.out.println("Late");
            if (diff >= 60) {
                int Hour = diff / 60;
                int Min = diff % 60;
                System.out.printf("%d:%02d hours after the start", Hour, Min);
                //shablon za vodeshta nula
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (ArrivalMinutes == ExamMinutes || diff <= 30) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int Hour = diff / 60;
                int Min = diff % 60;
                System.out.printf("%d:%02d hours before the start", Hour, Min);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}