package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());//брой на редове с числа
        String[] firstArray = new String[rows];
        String[] SecondArray = new String[rows];

        //четен ред (2, 4, 6, 8, ...)
        // -> първо число отива във втория; второто число отива в първия
        //нечетен ред (1, 2, 5, 7, ...)
        // -> първо число отива във първия; второто число отива в втория
        for (int row = 1; row <= rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];
            if (row % 2 == 0) {
                //firstNumber отива в secondArray
                SecondArray[row - 1] = firstNumber;
                //secondNumber отива в firstArray
                firstArray[row - 1] = secondNumber;
            }else {
                firstArray[row-1]=firstNumber;
                SecondArray[row-1]=secondNumber;
            }
        }
        //отпечатваме масив от текстове:
        //1. for по index
        //2. foreach по елементите
        //3. String.join !!!! само за масив от текстове !!!!

        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", SecondArray));
    }
}