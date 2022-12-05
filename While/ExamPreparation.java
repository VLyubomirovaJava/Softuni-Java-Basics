package While;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FailedThreshold = Integer.parseInt(scanner.nextLine());
        int FailedTimes = 0;
        int SolvedProblemsCount = 0;
        double GradeSum = 0;
        boolean isFailed = true;
        String LastProblem = "";
        while (FailedTimes < FailedThreshold) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                FailedTimes++;
            }
            GradeSum += grade;
            SolvedProblemsCount++;
            LastProblem = problemName;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", FailedThreshold);
        } else {
            System.out.printf("Average score: %.2f%n", GradeSum/SolvedProblemsCount);
            System.out.printf("Number of problems: %d%n", SolvedProblemsCount);
            System.out.printf("Last problem: %s", LastProblem);
        }
    }
}
