package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArraysvajno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prochitame dvata masiva
        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        boolean isIdentical = true;
        int sum = 0;
        int index = 0;
// iterate through the arrays to compare if they are identical
        for (int i = 0; i < firstArr.length; i++) {
// accessing each element of array
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];
            if (firstNum == secondNum) {
                sum = sum + firstNum;
            } else {
                isIdentical = false;
                index = i;
                break;
            }
        }
            if (isIdentical) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
            }
        }
    }
