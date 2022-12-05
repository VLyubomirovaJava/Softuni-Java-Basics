package Methods;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//a method that receives a single string and prints the count of the vowels
        String text = scanner.nextLine().toLowerCase(Locale.ROOT);
printVowelLetters(text);
    }
    public static void printVowelLetters(String text){
        int vowelCount=0;
        for (char symbol:text.toCharArray()) {
            if (symbol=='a' ||
                    symbol=='e' ||
                    symbol == 'u' ||
                    symbol == 'i' ||
                    symbol== 'o'){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}