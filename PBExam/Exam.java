package PBExam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int MoreThan5 = 0;
        int MoreThan4 = 0;
        int MoreThan3 = 0;
        int LessThan3 = 0;
        double gradeResult = 0;
        for (int student = 1; student <= students; student++) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade >= 5.00) {
                MoreThan5++;
            } else if (currentGrade >= 4.00) {
                MoreThan4++;
            } else if (currentGrade >= 3.00) {
                MoreThan3++;
            } else {
                LessThan3++;
            }
            gradeResult += currentGrade;
        }
            double TopStudents = 100.0 * MoreThan5 / students;
            double FourStudents = 100.0 * MoreThan4 / students;
            double ThreeStudents = 100.0 * MoreThan3 / students;
            double PoorStudents = 100.0 * LessThan3 / students;
            System.out.printf("Top students: %.2f%%%n", TopStudents);
            System.out.printf("Between 4.00 and 4.99: %.2f%%%n", FourStudents);
            System.out.printf("Between 3.00 and 3.99: %.2f%%%n", ThreeStudents);
            System.out.printf("Fail: %.2f%%%n", PoorStudents);
            System.out.printf("Average: %.2f", gradeResult / students);
        }
    }
