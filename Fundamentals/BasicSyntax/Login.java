package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
//1. username - входни данни
//2. парола - наобратно от 1.
//3. въвеждане на парола
        String password = "";
        for (int position = username.length() - 1; position >= 0; position--) {
            char CurrentSymbol = username.charAt(position);
            password += CurrentSymbol;
        }   //veche znaem parolata
        String enteredPassword = scanner.nextLine();
        int countFailedtries = 0;
        while (!enteredPassword.equals(password)) {
            //greshna parola
            countFailedtries++;
            //broqch greshni opiti
            if (countFailedtries == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        //vqrna parola
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}

