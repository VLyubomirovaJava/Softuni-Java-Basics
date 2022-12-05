package While;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MinNum = Integer.MAX_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum < MinNum) {
                MinNum = currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(MinNum);
    }
}