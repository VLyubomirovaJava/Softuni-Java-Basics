package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//You will receive a single string.
// Write a method that prints the middle character.
// If the length of the string is even, there are two middle characters

        String input = scanner.nextLine();

        System.out.println(MiddleCharacterPrint(input));
    }
    public static String MiddleCharacterPrint (String input)
    {
        //finding length
        int length =0;
        int position =0;
        if (input.length() % 2==0) {
            position = input.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = input.length() /2;
            length =1;
        }
        return input.substring(position,position + length);
    }
}