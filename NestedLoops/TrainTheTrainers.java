package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // broq na jurito
        String command = scanner.nextLine();
        int CounterScores = 0;
        double AllGradeSum =0;

        while (!command.equals("Finish")) {
            String presentation = command;
            double CurrentGradeSum =0;
            for (int i = 1; i <= n; i++) { // vzimame ocenka ot vseki ot jurito
                double CurrentScore = Double.parseDouble(scanner.nextLine()); // ocenka na ppt ot vseki juri
                CurrentGradeSum += CurrentScore;
                CounterScores++;
            }
            AllGradeSum =AllGradeSum +CurrentGradeSum; // subiram ocenki ot vs ppt
            double avgCurrentGrade = CurrentGradeSum / n; //tuk namirame sredna ocenka na vs ppt, deleno  a juri
            System.out.printf("%s - %.2f.%n", presentation, avgCurrentGrade);
            command = scanner.nextLine();
        }
        double finalGrade = AllGradeSum / CounterScores;
        System.out.printf("Student's final assessment is %.2f.",finalGrade);
    }
}