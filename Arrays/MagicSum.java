package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number.
//vzimam vseki element ot teksta i preobrazuvam v chislo, posle pravq masiv ot chislata
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        //1. vzimam chislo ot masiva -> obhojdam vs chisla sled nego
        for (int index = 0; index <= numbers.length - 1; index++) {
            //sudurja chisloto koeto e na tekushtiq index ot for cikula
            int currentNumber = numbers[index];
            //celta e da obhodim vs chisla sled nasheto chislo
            for (int inIndex = index + 1; inIndex <= numbers.length - 1; inIndex++) {
                int inNumber = numbers[inIndex];
                if (currentNumber + inNumber == magicSum) {
                    System.out.println(currentNumber + " " + inNumber);
                }
            }
        }
    }
}