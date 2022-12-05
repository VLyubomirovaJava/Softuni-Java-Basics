package Arrays;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program that emulates typing an SMS, following this guide:
        int tapTimes = Integer.parseInt(scanner.nextLine());
        String message = "";
//generating the consecutive numbers, received by the console
        for (int i = 0; i < tapTimes; i++) {
            String digits = scanner.nextLine();
            int digitLength = digits.length();
            char oneDigit = digits.charAt(0);
            int mainDigit = Character.getNumericValue(oneDigit);
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;
            }
            int letterIndex = (offset + digitLength - 1);
            int letterCode = letterIndex + 97;
            //izvejdame bukvata sprqmo  ascii stoinostta;
            char letter = (char) letterCode;
            if (mainDigit == 0) {
                letter = (char) (mainDigit + 32);
            }
            //dobavqme vsqka bukva kum printiranoto
            message += letter;

        }
        System.out.println(message);
    }
}