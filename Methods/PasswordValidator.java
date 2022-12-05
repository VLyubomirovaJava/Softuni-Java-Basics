package Methods;

import java.util.Scanner;
import java.util.*;
import java.lang.String;
import java.lang.Character;


public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program that checks if a given password is valid.
//•	6 – 10 characters (inclusive);
//•	Consists only of letters and digits;
//•	Have at least 2 digits.

        String inputPassword = scanner.nextLine();

        boolean isPasswordLengthValid= isValidLength(inputPassword);
        if (!isPasswordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
boolean isValidContent =consistsOfValidSymbols(inputPassword);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

boolean hasEnoughDigits =isValidCountOfDigits(inputPassword);
        if (!hasEnoughDigits) {
            System.out.println("Password must have at least 2 digits");
        }
if (isPasswordLengthValid && isValidContent && hasEnoughDigits ) {
    System.out.println("Password is valid");
}

    }

    public static boolean isValidLength(String password) {
        // 6-10 characters;
        if (password.length() >= 6 && password.length()<=10) {
            return true;
        }
        else {
            return false;

        }
    }
        public static boolean consistsOfValidSymbols(String password) {
            //Consists only of letters and digits;

            for (char symbol : password.toCharArray()) {

                if (!Character.isLetterOrDigit(symbol)) {
                    return false;
                }
            }
                    return true;
                }


        public static boolean isValidCountOfDigits(String password){
        int digitCount=0;
            for (char symbol:password.toCharArray()) {
                if (Character.isDigit(symbol)) {
                    digitCount++;
                }
            }
                if (digitCount>=2){
                    return true;
                }
                else {
                    return false;
                }
            }

    }
