package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Read two integer numbers.
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        // Calculate the factorial of each number.
        long factorial1 =findFactorial(num1);
        long factorial2 =findFactorial(num2);
        // Divide the first result by the second
        double result =factorial1*1.0/factorial2;
        // and print the division formatted to the second decimal point.
        System.out.printf("%.2f",result);
    }
    public static long findFactorial(int num){
long factorial =1;
        for (int i = 1; i <=num ; i++) {
            factorial *=i;
        }
        return factorial;
    }
}