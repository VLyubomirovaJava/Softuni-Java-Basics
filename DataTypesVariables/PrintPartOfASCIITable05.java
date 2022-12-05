package DataTypesVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни: начален аски код; краен аски код
        int initial = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        //всеки аски код от началния до крайния
        for (int code = initial; code <=ending ; code++) {
            System.out.print((char) code + " ");
        }
        //повтаряме: отпечатваме кой е символа срещу съответния код
    }
}