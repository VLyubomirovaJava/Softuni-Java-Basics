package NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int CurrentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += CurrentDigit;
                } else {
                    oddSum += CurrentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}