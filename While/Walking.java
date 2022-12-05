package While;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        int dailySteps = 0;
        int StepSum = 0;
        int StepGoal = 10000;
        while (dailySteps < StepGoal && !"Going home".equals(command=scanner.nextLine())) {
            dailySteps += Integer.parseInt(command);
        }
        if (command.equals("Going home")) {
            dailySteps += Integer.parseInt(scanner.nextLine());
        }
        if (dailySteps < 10000) {
            System.out.printf("%d more steps to reach goal.", StepGoal - dailySteps);
        } else {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", dailySteps - 10000);
        }
    }
}