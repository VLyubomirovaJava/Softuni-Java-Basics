package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStringsVajno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        for(int i = inputArr.length -1; i >= 0;
        i--){
            System.out.print(inputArr[i] + " ");
        }
    }
}
