package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class ForeignLanguages06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        switch (country) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentine":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}