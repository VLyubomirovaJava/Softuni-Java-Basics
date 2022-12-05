package ConditionsLab;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String EvenOrOdd = "";
        boolean isZero = false;
        switch (operator) {
            case "+":
                result = N1 + N2;
                break;

            case "-":
                result = N1 - N2;
                break;

            case "*":
                result = N1 * N2;
                break;

            case "/":
                //pravim go za da ne se kara intelij che sa dva int koito pravqt double
                if (N2 ==0){
                    isZero = true;
                } else {
                    result = N1 * 1.0 / N2;
                }
                break;
            case "%":
                if (N2 ==0){
                    isZero = true;
                } else {
                    result = N1 % N2;
                }
                break;
        }
        if (result % 2 == 0) {
            EvenOrOdd = "even";
        } else {
            EvenOrOdd = "odd";
        }
        if (operator.equals("+")|| operator.equals("-")|| operator.equals("*")){
System.out.printf("%d %s %d = %.0f - %s", N1, operator , N2, result, EvenOrOdd);
    } else if (operator.equals("/") && !isZero) {
            System.out.printf("%d %s %d = %.2f", N1,operator, N2, result);
        } else if (operator.equals("%")&&!isZero) {
            System.out.printf("%d %s %d = %.0f", N1,operator, N2, result);
        } else {
            System.out.printf("Cannot divide %d by zero",N1);
        }
    }}