package Methods;

import java.util.Scanner;

public class RepeatString {
    private static String inputStr;
    private static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String resultText = repeatString(count, inputStr);
        System.out.println(resultText);
    }

    public static String repeatString(int count, String text) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + text;

        }
        return result;
    }
}