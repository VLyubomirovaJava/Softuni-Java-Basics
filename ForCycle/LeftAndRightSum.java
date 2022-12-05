package ForCycle;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int LeftSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            LeftSum = LeftSum + currentNum;
        }
        int RightSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            RightSum = RightSum + currentNum;
        }
        if (LeftSum == RightSum) {
            System.out.printf("Yes, sum =%d", LeftSum);
        } else {
            int diff = Math.abs(LeftSum - RightSum);
            System.out.printf("No, diff = %d",diff);
        }
    }
}