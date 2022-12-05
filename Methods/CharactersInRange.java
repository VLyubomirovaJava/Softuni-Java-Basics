package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//a method that receives two characters and prints all
// the characters in between them
// on a single line according to ASCII.

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        printCharactersInRange(symbol1, symbol2);

    }

    public static void printCharactersInRange(char symbol1, char symbol2) {
        // proverka koi e po-malkiq simvol ,za da zapochnem ot nego
        if (symbol1 < symbol2) {
            // zapochvame ot symbol1
            for (char symbol = (char)(symbol1 + 1); symbol < symbol2; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            //zapochvame ot symbol2
            for (char symbol = (char) (symbol2 + 1); symbol < symbol1; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}