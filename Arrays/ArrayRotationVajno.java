package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotationVajno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program that receives an array and the number of rotations you have to perform (the first element goes at the end). Print the resulting array.
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)//parsvam kum int
                .toArray();// posle pak vrushtam v masiva
        int rotations = Integer.parseInt(scanner.nextLine()); // broi rotacii
        for (int rotation = 1; rotation <= rotations; rotation++) {
            //1. vzimame purviq element
            int firstElement = numbers[0];
            //2. premestvame vsichki elementi s 1 nalqvo
            // vsichki indeksi se obhojdat ot purviq do predposledniq (predposledniq bi bil -2)
            for (int index = 0; index < numbers.length-1 ; index++) {
               numbers[index]=numbers[index+1];
            }
            //3. slagame na posledna poziciq purviq vzet element
            numbers[numbers.length - 1] = firstElement;
        }
        //otpechatvame masiva
        for (int number: numbers) {
            System.out.print(number+" ");
        }
    }
}