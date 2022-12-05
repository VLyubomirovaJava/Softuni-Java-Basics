package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// a method sum to get the sum of the first two integers and
// subtract the method that subtracts the third integer from the result
// from the sum method.
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
int sumOfNumbers =getSum(num1,num2);
int substractThirdNum = substractThirdNum(num1,num2,num3);
        System.out.println(substractThirdNum);

    }

    //method to get sum of first 2 num
public static int getSum(int n1, int n2){
    return n1+n2;
    }
    public static int substractThirdNum(int n1, int n2, int n3){
        return (n1 +n2)-n3;
    }
}