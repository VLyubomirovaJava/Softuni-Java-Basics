package Arrays;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //program that determines if an element exists in the array such that the sum of the elements on its left is equal to the sum of the elements on its right.
        // If there are no elements to the left/right, their sum is considered to be 0.
        // Print the index that satisfies the required condition or "no" if there is no such index.

        //input array
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int divider = 0;
        boolean flag = false;
        //ot chislata v input-a pravim masiv
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }
            if (leftSum == rightSum) {
                flag = true;
                divider = i;
                break;
            }
        }
            if (flag) {
                System.out.println(divider);
            } else {
                System.out.println("no");
            }
        }
    }


