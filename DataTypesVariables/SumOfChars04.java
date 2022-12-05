package DataTypesVariables;

import java.util.Scanner;


public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program that sums the ASCII codes of n characters. Print the sum on the console.
//Input
//•	On the first line, you will receive n – the number of lines that follow.
        int countSymbols =Integer.parseInt(scanner.nextLine());
        int sum =0;
//•	On the next n lines – you will receive letters from the Latin alphabet.
        for (int symbol = 1; symbol <=countSymbols ; symbol++) {
            sum += scanner.nextLine().charAt(0);
        }

        System.out.printf("The sum equals: %d", sum);
//Output
//Print the total sum in the following format:
//"The sum equals: {totalSum}"

    }

    }