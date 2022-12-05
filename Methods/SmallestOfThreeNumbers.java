package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//method to print the smallest of three integer numbers.
// vhodni danni
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
printSmallestNumber(num1,num2,num3);

    }

    //metod, koito printira nai-malkoto chislo
     public static void printSmallestNumber(int n1, int n2, int n3) {
    if (n1 < n2 && n1 <n3){
        System.out.println(n1);

    } else if (n2<n1 && n2 <n3) {
        System.out.println(n2);

    } else {
        System.out.println(n3);
    }
     }
}