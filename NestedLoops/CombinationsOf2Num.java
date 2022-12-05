package NestedLoops;

import java.util.Scanner;

public class CombinationsOf2Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int MagicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isValid = false;
        for (int i = num1; i <= num2; i++) {
            for (int j = num1; j <= num2; j++) {
                count++;
                int sum = i + j;
                if (sum == MagicNum) {
                    isValid = true;
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)%n", i, j, sum);
                    break;
                }
            }
            if (isValid ) {
                break;
            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d%n", count, MagicNum);
        }
    }
    }
