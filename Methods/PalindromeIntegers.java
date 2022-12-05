package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//A palindrome is a number that reads the same backward as forward, such as 323 or 1001.
//reads a positive integer number until you receive "END".For each numbered print, whether the number is palindrome or not.

        String command = scanner.nextLine();
while (!command.equals("END")){
    if (!isReversedString(command)){
        System.out.println("false");
    }else {
        System.out.println("true");
    }
    command=scanner.nextLine();
}
    }
    public static boolean isReversedString(String command){
        StringBuilder reversedCommand = new StringBuilder();
        for (int i = command.length()-1; i >=0 ; i--) {
            reversedCommand.append(command.charAt(i));
        }
        return command.equals(reversedCommand.toString());
    }
}