package MoreExerciseFundamentals;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        String reverse ="";
        int length =input.length();
//Write a program that reverses a string and prints it on the console.
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }
}
