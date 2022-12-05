package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(n1, n2);
                break;
            case "divide":
                divide(n1, n2);
                break;
            case "multiply":
                multiply(n1, n2);
                break;
            case "substract":
                substract(n1, n2);
                break;
        }
    }
private static void substract(int n1, int n2){
            System.out.println(n1-n2);
        }
        private static void multiply(int n1, int n2){
            System.out.println(n1*n2);
        }
        private static void divide(int n1, int n2){
            System.out.println(n1/n2);
    }
    private static void add(int n1, int n2){
        System.out.println(n1+n2);
    }
    }