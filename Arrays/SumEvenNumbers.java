package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Java program to find out
// Sum of elements at even and
// odd index positions separately

        String inputLine = scanner.nextLine();
        String[] inputArr = inputLine.split(" ");
        int[] numsArr = new int[inputArr.length];
        int sum=0;

        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = Integer.parseInt(inputArr[i]);
                if (numsArr[i] % 2 == 0) {
                    sum += numsArr[i];
                }
            }

        System.out.println(sum);
    }
}