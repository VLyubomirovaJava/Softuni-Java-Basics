package While;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean IsExpelled = false;
        int years = 1;
        int poorgradeCnt = 0;
        double SumAllGrades = 0;

        while (years <= 12) {
            if (poorgradeCnt > 1) {
                IsExpelled = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                poorgradeCnt++;
                continue;
                // prekusva interaciqta i zapochva sledvashta
            }
            SumAllGrades += grade;

            years++;
        }
        if (IsExpelled) {
            System.out.printf("%s has been excluded at %d grade", name, years);
        } else {
            double avg = SumAllGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f ", name, avg);
        }
    }
}